import java.util.ArrayList;

class RPG {
 // modifies each Creature's agility by a range from -3 to 3, then returns the list of monsters as fast or faster than the player if faster is true, otherwise returns slower monsters
 public static ArrayList<Monster> initiative(ArrayList<Monster> monsters, Player p, boolean atRange, boolean faster) {
    int target = 0;
    if(atRange) {
      target = p.getAgility() + utils.random(0, 6);
      }
    else {
      target = p.getAgility() + utils.random(-3, 3);
      }
    ArrayList<Integer> speeds = new ArrayList<Integer>();
    for(int i = 0; i < monsters.size(); i++) {
      speeds.add(monsters.get(i).getAgility() + utils.random(-3, 3));
      }
    ArrayList<Monster> returnMonsters = new ArrayList<Monster>();
    for(int i = 0; i < speeds.size(); i++) {
      if(speeds.get(i) >= target && faster) {
        returnMonsters.add(monsters.get(i));
        }
      if(speeds.get(i) < target && !faster) {
        returnMonsters.add(monsters.get(i));
        }
      }
    return returnMonsters;
    }
 
 // returns false if player is dead
 public static boolean hitHealPlayer(Player p, ArrayList<Monster> monsters, boolean atRange) {
   int damage = 0;
   utils.print("you are attacked by");
   if(atRange) {
       for(int i = 0; i < monsters.size(); i++) {
         int weaponNumber = utils.random(0, monsters.get(i).numberOfRangedWeapons() - 1);
         System.out.println("a " + monsters.get(i) + " with " + monsters.get(i).getRangedWeapon(weaponNumber));
         damage += monsters.get(i).dealRangedDamage(weaponNumber);
         }
       }
     else {
       for(int i = 0; i < monsters.size(); i++) {
         int weaponNumber = utils.random(0, monsters.get(i).numberOfMeleeWeapons() - 1);
         System.out.println("a " + monsters.get(i) + " with " + monsters.get(i).getMeleeWeapon(weaponNumber));
         damage += monsters.get(i).dealMeleeDamage(weaponNumber);
         }
       }
   int taken = 0;
   if(damage > 0) {
     System.out.println("you have " + damage + " damage coming your way");
     taken = p.takeDamage(damage);
     if(taken == 1) {
       utils.print("you almost blocked that, but due to lack of skill you recieve 1 point of damage");
       }
     else if(taken > 1) {
       System.out.println("alas, you are not able to block it all, and you suffer " + taken + " points of damage");
       }
     else {
       utils.print("you didn't take even a scratch!");
       }
     }
   else {
     if(monsters.size() > 1) {
       utils.print("you enemies are even more skilled than you, for they deal you not 1 point of damage!");
       }
     else {
       utils.print("your foe is a worthy opponent, for he just dealt you a whopping no damage!");
       }
     }
   int healed = p.heal();
   if(healed == 1) {
     utils.print("you found a bandaid and regain 1 point of lost health!");
     }
   else if(healed > 1) {
     System.out.println("you must have a medical degree or strong magic indeed to be able to heal " + healed + " points of damage!");
     }
   if(taken > 0 || healed > 0) {
     System.out.println("you now have " + p.getHealth() + " health");
     }
   return(p.getHealth() > 0);
   }
 
 // returns false if there are no monsters
 public static boolean hitHealMonster(Player p, ArrayList<Monster> monsters, int whichMonster, boolean atRange) {
   ArrayList<String> mWeapons = new ArrayList<String>();
   for(int i = 0; i < p.numberOfMeleeWeapons(); i++) {
     mWeapons.add(p.getMeleeWeapon(i).toString());
     }
   ArrayList<String> rWeapons = new ArrayList<String>();
   for(int i = 0; i < p.numberOfRangedWeapons(); i++) {
     rWeapons.add(p.getRangedWeapon(i).toString());
     }
   
   utils.print("please select your weapon");
   int damage = 0;
   if(atRange) {
     damage = p.dealRangedDamage(utils.menu(rWeapons));
     }
   else {
     damage = p.dealMeleeDamage(utils.menu(mWeapons));
     }
   System.out.println("you hit a " + monsters.get(whichMonster) + " for " + damage + " damage.");
   int taken = monsters.get(whichMonster).takeDamage(damage);
   if(taken > 0) {
     utils.print("their armour can not completely shield them and they take damage");
     }
   int healed = monsters.get(whichMonster).heal();
   if(healed > 0) {
     utils.print("unfortunately, the " + monsters.get(whichMonster) + " appears to have recovered a little");
     }
   if(monsters.get(whichMonster).getHealth() <= 0) {
     System.out.print("good job! you killed a " + monsters.get(whichMonster) + "!");
     monsters.remove(whichMonster);
     if(monsters.size() == 0) {
       utils.print("");
       return false;
       }
     else {
       utils.print(" now all that remains are");
       utils.printMonsters(monsters);
       return true;
       }
     }
   return true;
   }
 
 public static boolean combat(Player p, CombatNode node, boolean atRange){
   node.startCombat();
   ArrayList<Monster> monsters = node.monsterList();
   ArrayList<Monster> successful = new ArrayList<Monster>();
   utils.print("You are brave indeed to face");
   utils.printMonsters(monsters);
   while(!node.combatOver()) {
     ArrayList<String> options = new ArrayList<String>();
     options.add("flee");
     if(atRange) {
       options.add("charge into melee");
       options.add("continue fighting a battle at range");
       }
     else {
       options.add("escape into ranged combat");
       options.add("continue close quarters fighting");
       }
     utils.print("what would you like to do this round?");
     switch(utils.menu(options)) {
       case 0:
         successful = initiative(monsters, p, atRange, true);
         if(successful.size() == 0) {
           utils.print("good job! you escaped!");
           return true;
           }
         else {
           utils.print("sorry, you were caught by");
           utils.printMonsters(successful);
           if(!hitHealPlayer(p, successful, false)) {
             return false;
             }
           if(atRange) {
             utils.print("you are now in melee with the monsters");
             atRange = false;
             }
           else {
             utils.print("you remain in melee with the monsters");
             }
           utils.print("now for the main combat phase");
           }
         break;
       case 1:
         if(atRange) {
           atRange = false;
           ArrayList<Monster> suprised = initiative(monsters, p, atRange, false);
           if(suprised.size() > 0) {
             utils.print("good job! you suprised");
             utils.printMonsters(suprised);
             utils.print("you get an extra suprise melee attack! who would you like to perform the extra attack on?");
             ArrayList<String> monsterMenu = new ArrayList<String>();
             for(int i = 0; i < suprised.size(); i++) {
               monsterMenu.add(suprised.get(i).toString());
               }
             if(!hitHealMonster(p, suprised, utils.menu(monsterMenu), false)) {
               return true;
               }
             utils.print("now for the main combat phase");
             }
           }
         else {
           successful = initiative(monsters, p, atRange, true);
           if(successful.size() == 0) {
             utils.print("good job! you got some distance from the monsters!");
             atRange = true;
             utils.print("now for the main combat phase");
             }
           else {
             utils.print("sorry, you were stopped by");
             utils.printMonsters(successful);
             if(!hitHealPlayer(p, successful, false)) {
               return false;
               }
             utils.print("you remain in melee");
             utils.print("now for the main combat phase");
             }
           }
         break;
       case 2:
         // nothing to see here
         break;
         }
     
     if(!hitHealMonster(p, monsters, utils.random(0, monsters.size() - 1), atRange)) {
       return true;
       }
     
     if(!hitHealPlayer(p, monsters, atRange)) {
       return false;
       }
     }
  
   Node next = node.getNext();
   next = next.getNext();
   System.out.println(next);
   return true;
 }
 
 public static void main(String[] args) {
  ArrayList<Monster> normal = new ArrayList<Monster>();
  normal.add(MakeMonster.skeleton());
  normal.add(MakeMonster.skeletonArcher());
  normal.add(MakeMonster.zombie());

  ArrayList<Monster> special = new ArrayList<Monster>();
  special.add(MakeMonster.armouredSkeleton());
  special.add(MakeMonster.flameArcher());
  special.add(MakeMonster.skeletalWizard());
  
  Player human = new Player("Rogue", "Joe", new MeleeWeapon[]{new MeleeWeapon("Sword", 3, 6)}, new RangedWeapon[]{new RangedWeapon("Crossbow", 4, 2)}, 40, 20, 6, 0);
  System.out.println("you are a " + human);
  /*
  EndNode flee = new EndNode("You live happily ever after...Coward!");
  EndNode fight = new EndNode("And then you died...");
  ArrayList<Node> endings = new ArrayList<Node>();
  endings.add(flee);
  endings.add(fight);
  ComputerDecisionNode decision = new PlayerDecisionNode(endings, menu);
  */
  EndNode ending = new EndNode("...the end");
  CombatNode node = new CombatNode(special, normal, 3, 8, ending);
  
  if(combat(human, node, true)) {
    utils.print("good job! you won!");
    }
  else {
    utils.print("you lost. loser.");
    }
  System.out.println(node.getNext());
  }
 }