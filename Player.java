public class Player extends Creature {
  public Player(String tempclassName, String tempName, MeleeWeapon[] tempMeleeWeapons, RangedWeapon[] tempRangedWeapons, int tempHealth, int tempDefenseValue, int tempAgility, int tempHealRate){
    super(tempName, tempMeleeWeapons, tempRangedWeapons, tempHealth, tempDefenseValue,  tempAgility, tempHealRate);
    className = tempclassName;
  }
   public String toString() {
  return ("Level " + level + " human " + className + " named " + name);
  }
  private int xp = 0;
  private int level = 1;
  private String className;
}