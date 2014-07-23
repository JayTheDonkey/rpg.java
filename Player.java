public class Player extends Creature {
  public Player(String tempclassName, String tempName, MeleeWeapon[] tempMeleeWeapons, RangedWeapon[] tempRangedWeapons, Spell[] tempSpells, Armor[] tempArmor, int tempStrength, int tempConstitution, int tempDexterity, int tempSpeed, int tempIntelligence, int tempWizardry, int tempLuck, int tempCharisma, int tempHealRate, int tempGP){
    super(tempName, tempMeleeWeapons, tempRangedWeapons, tempSpells, tempArmor, tempStrength, tempConstitution, tempDexterity, tempSpeed, tempWizardry, tempIntelligence, tempHealRate, tempGP);
    className = tempclassName;
    luck = tempLuck;
    charisma = tempCharisma;
    xp = 0;
    level = 1;
  }
  public String toString() {
    return name;
  }
  public void addXP(int monsterXP){
    xp += monsterXP;
  }
  public int getXP(){
    return xp;
  }
  public int getLevel() {
    return level;
  }
  public String getClassName() {
    return className;
  }
  public int getIntelligence() {
    return intelligence;
  }
  public int getLuck() {
    return luck;
  }
  public int getCharisma() {
    return charisma;
  }
  private int luck, charisma;
  private int xp;
  private int level;
  private String className;
}