public class Player extends Creature {
  public Player(String tempclassName, String tempName, Weapon[] tempWeapons, int tempHealth, int tempDefenseValue, int tempAgility, int tempHealRate){
    super(tempName, tempWeapons, tempHealth, tempDefenseValue,  tempAgility, tempHealRate);
    className = tempclassName;
  }
   public String toString() {
  return ("Level "+ level +" human "+className+" named "+name);
  }
  private int xp = 0;
  private int level = 1;
  private String className;
}