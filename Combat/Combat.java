import java.util.ArrayList;

public class Combat {
  // modifies each Creature's agility by a range from -3 to 3, then returns the list of monsters as fast or faster than the player if faster is true, otherwise returns slower monsters
  private static ArrayList<Monster> initiative(ArrayList<Monster> monsters, Player p, boolean atRange, boolean faster) {
    int target = 0;
    if(atRange) {
      target = p.getSpeed() + utils.random(0, 7);
    }
    else {
      target = p.getSpeed() + utils.random(-3, 4);
    }
    ArrayList<Integer> speeds = new ArrayList<Integer>();
    for(int i = 0; i < monsters.size(); i++) {
      speeds.add(monsters.get(i).getSpeed() + utils.random(-3, 4));
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
  private static boolean hitHealPlayer(Player p, ArrayList<Monster> monsters, boolean atRange) {
    int blockable = 0;
    int unblockable = 0;
    UI.out.println("you are attacked by");
    ArrayList<Monster> attackers = new ArrayList<Monster>();
    ArrayList<Attack> attackersWeapons = new ArrayList<Attack>();
    for(int i = 0; i < monsters.size(); i++) {
      attackers.add(monsters.get(i));
      if(atRange) {
        int weaponNumber = utils.random(0, monsters.get(i).getUsableRangedAttacks().size());
        attackersWeapons.add(monsters.get(i).getUsableRangedAttacks().get(weaponNumber));
        Damage temp = monsters.get(i).dealRangedDamage(weaponNumber);
        blockable += temp.getBlockable();
        unblockable += temp.getUnblockable();
      }
      else {
        int weaponNumber = utils.random(0, monsters.get(i).getUsableMeleeAttacks().size());
        attackersWeapons.add(monsters.get(i).getUsableMeleeAttacks().get(weaponNumber));
        Damage temp = monsters.get(i).dealMeleeDamage(weaponNumber);
        blockable += temp.getBlockable();
        unblockable += temp.getUnblockable();
      }
    }
    UI.printMonstersAndWeapons(attackers, attackersWeapons);
    int taken = 0;
    if(blockable + unblockable > 0) {
      UI.out.println("you have " + blockable + " damage and " + unblockable + " spite damage coming your way");
      taken = p.takeDamage(new Damage(blockable, unblockable));
      if(taken == 1) {
        UI.out.println("you almost blocked that, but due to lack of skill you recieve 1 point of damage");
      }
      else if(taken > 1) {
        UI.out.println("alas, you are not able to block it all, and you suffer " + taken + " points of damage");
      }
      else {
        UI.out.println("you didn't take even a scratch!");
      }
    }
    else {
      if(monsters.size() > 1) {
        UI.out.println("you enemies are even more skilled than you, for they deal you not 1 point of damage!");
      }
      else {
        UI.out.println("your foe is a worthy opponent, for he just dealt you a whopping 0 damage!");
      }
    }
    int healed = p.heal();
    if(healed == 1) {
      UI.out.println("you found a bandaid and regain 1 point of lost health!");
    }
    else if(healed > 1) {
      UI.out.println("you must have a medical degree or strong magic indeed to be able to heal " + healed + " points of damage!");
    }
    if(taken > 0 || healed > 0) {
      UI.out.println("you now have " + p.getConstitution() + " health");
    }
    UI.out.println("");
    return(p.getConstitution() > 0);
  }

  // returns false if there are no monsters
  private static boolean hitHealMonster(Player p, ArrayList<Monster> monsters, int whichMonster, boolean atRange) {
    ArrayList<String> rAttacks = new ArrayList<String>();
    for(int i = 0; i < p.getUsableRangedAttacks().size(); i++) {
      rAttacks.add(p.getUsableRangedAttacks().get(i).toString());
    }
    ArrayList<String> mAttacks = new ArrayList<String>();
    for(int i = 0; i < p.getUsableMeleeAttacks().size(); i++) {
      mAttacks.add(p.getUsableMeleeAttacks().get(i).toString());
    }

    Damage damage;
    if(atRange) {
      damage = p.dealRangedDamage(UI.menu("please select your weapon", rAttacks));
    }
    else {
      damage = p.dealMeleeDamage(UI.menu("please select your weapon", mAttacks));
    }
    UI.out.println("you hit a " + monsters.get(whichMonster) + " for " + damage.getBlockable() + " damage and " + damage.getUnblockable() + " spite damage");
    int taken = monsters.get(whichMonster).takeDamage(damage);
    if(taken > 0) {
      UI.out.println("their armour cannot completely shield them and they take damage");
    }
    else {
      UI.out.println("alas, their defenses are too strong! you do not get through");
    }
    int healed = monsters.get(whichMonster).heal();
    if(healed > 0) {
      UI.out.println("unfortunately, the " + monsters.get(whichMonster) + " appears to have recovered a little");
    }
    if(monsters.get(whichMonster).getConstitution() <= 0) {
      UI.out.print("good job! you killed a " + monsters.get(whichMonster) + " and got " + monsters.get(whichMonster).getMonsterRating() + "xp!");
      p.addXP(monsters.remove(whichMonster).getMonsterRating());
      if(monsters.size() == 0) {
        UI.out.println("\n");
        return false;
      }
      else {
        UI.out.println(" now all that remains are");
        UI.printMonsters(monsters);
        UI.out.println("");
        return true;
      }
    }
    UI.out.println("");
    return true;
  }

  // run the combat
  private static boolean actualCombat(Player p, CombatNode node, boolean atRange){
    node.startCombat();
    ArrayList<Monster> monsters = node.monsterList();
    ArrayList<Monster> successful = new ArrayList<Monster>();
    UI.out.println("You are brave indeed to face");
    UI.printMonsters(monsters);
    UI.out.println("");
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
      switch(UI.menu("what would you like to do this round?", options)) {
        case 0:
        successful = initiative(monsters, p, atRange, true);
        if(successful.size() == 0) {
          UI.out.println("\ngood job! you escaped!");
          return true;
        }
        else {
          UI.out.println("\nsorry, you were caught by");
          UI.printMonsters(successful);
          if(!hitHealPlayer(p, successful, false)) {
            return false;
          }
          if(atRange) {
            UI.out.println("you are now in melee with the monsters");
            atRange = false;
          }
          else {
            UI.out.println("you remain in melee with the monsters");
          }
          UI.out.println("\nnow for the main combat phase");
        }
        break;
        case 1:
        if(atRange) {
          atRange = false;
          ArrayList<Monster> suprised = initiative(monsters, p, atRange, false);
          if(suprised.size() > 0) {
            UI.out.println("good job! you suprised");
            UI.printMonsters(suprised);
            ArrayList<String> monsterMenu = new ArrayList<String>();
            for(int i = 0; i < suprised.size(); i++) {
              monsterMenu.add(suprised.get(i).toString());
            }
            if(!hitHealMonster(p, suprised, UI.menu("\nyou get an extra suprise melee attack! who would you like to perform the extra attack on?", monsterMenu), false)) {
              return true;
            }
            UI.out.println("\nnow for the main combat phase");
          }
        }
        else {
          successful = initiative(monsters, p, atRange, true);
          if(successful.size() == 0) {
            UI.out.println("good job! you got some distance from the monsters!");
            atRange = true;
            UI.out.println("\nnow for the main combat phase");
          }
          else {
            UI.out.println("sorry, you were stopped by");
            UI.printMonsters(successful);
            if(!hitHealPlayer(p, successful, false)) {
              return false;
            }
            UI.out.println("you remain in melee");
            UI.out.println("\nnow for the main combat phase");
          }
        }
        break;
        case 2:
          // nothing to see here
        break;
      }

      if(!hitHealMonster(p, monsters, utils.random(0, monsters.size()), atRange)) {
        p.reset();
        return true;
      }

      if(!hitHealPlayer(p, monsters, atRange)) {
        p.reset();
        return false;
      }
    }
    p.reset();
    return true;
  }

  public static boolean run(Player p, CombatNode node, boolean atRange){
    boolean returnValue = actualCombat(p, node, atRange);
    p.reset();
    return returnValue;
  }
}
