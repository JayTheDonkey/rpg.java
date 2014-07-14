import java.util.ArrayList;

class RPG {
 public  static boolean combat(Player p, CombatNode node){
   boolean atRange = true;
   node.startCombat();
   ArrayList<Monster> monsters = node.monsterList();
   utils.print("You are brave indeed to face");
   utils.printMonsters(monsters);
   ArrayList<String> fightOrFlee = new ArrayList<String>();
   fightOrFlee.add("fight");
   fightOrFlee.add("flee");
   ArrayList<String> weapons = new ArrayList<String>();
   for(int i = 0; i < p.numberOfWeapons(); i++) {
     weapons.add(p.getWeapon(i).toString());
     }
   while(!node.combatOver()) {
     utils.print("would you like to face combat or run like a coward?");
     if(utils.menu(fightOrFlee) == 1) {
       return false;
       }
     if(atRange) {
       utils.print("you are out of direct melee. would you like to move into close quarters with the enemy?");
       
     utils.print("please select your weapon");
     int goodDamage = p.dealDamage(utils.menu(weapons));
     monsters.get(0).takeDamage(goodDamage);
     if(monsters.get(0).getHealth() <= 0) {
       Monster dead = monsters.remove(0);
       if(monsters.size() == 0) {
         return true;
         }
       utils.print("yay! you killed a " + dead + ". now all that remains are");
       utils.printMonsters(monsters);
       }
     System.out.println("yay! you did " + goodDamage + " damage!");
     int badDamage = 0;
     for(int i = 0; i < monsters.size(); i++) {
       badDamage += monsters.get(i).dealDamage(utils.random(0, monsters.size() - 1));
       }
     p.takeDamage(badDamage);
     System.out.println("ow! you took " + badDamage + " damage!");
     System.out.println("you are down to " + p.getHealth() + " health!");
     if(p.getHealth() <= 0) {
       return false;
       }
     p.heal();
     for(int i = 0; i < monsters.size(); i++) {
       monsters.get(i).heal();
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
  
  Player human = new Player("Rogue", "Joe", new Weapon[]{new Weapon("Sword", 3, 6, false), new Weapon("Crossbow", 4, 2, true)}, 40, 20, 1, 0);
  System.out.println(human);
  EndNode flee = new EndNode("You live happily ever after...Coward!");
  EndNode fight = new EndNode("And then you died...");
  ArrayList<Node> endings = new ArrayList<Node>();
  endings.add(flee);
  endings.add(fight);
  ArrayList<String> menu = new ArrayList<String>();
  menu.add("flee");
  menu.add("fight");
  PlayerDecisionNode decision = new PlayerDecisionNode(endings, menu);
  CombatNode node = new CombatNode(special, normal, 3, 8, decision);
  
  if(combat(human, node)) {
    utils.print("good job! you won!");
    }
  else {
    utils.print("you lost. loser.");
    }
  }
 }