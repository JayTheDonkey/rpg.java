import java.util.Arrays;
import java.util.ArrayList;

public abstract class Creature {
 public Creature(String tempName, MeleeWeapon[] tempMeleeWeapons, RangedWeapon[] tempRangedWeapons, Spell[] tempSpells, int tempStrength, int tempConstitution, int tempDexterity, int tempSpeed, int tempWizardry, int tempIntelligence, int tempDefenseValue, int tempHealRate) {
  name = tempName;
  meleeWeapons = new ArrayList<MeleeWeapon>(Arrays.asList(tempMeleeWeapons));
  rangedWeapons = new ArrayList<RangedWeapon>(Arrays.asList(tempRangedWeapons));
  spells = new ArrayList<Spell>(Arrays.asList(tempSpells));
  strength = tempStrength;
  constitution = tempConstitution;
  dexterity = tempDexterity;
  speed = tempSpeed;
  wizardry = tempWizardry;
  intelligence = tempIntelligence;
  defenseValue = tempDefenseValue;
  healRate = tempHealRate;
}

public int dealMeleeDamage(int weaponNumber) {
  if(weaponNumber >= 0 && weaponNumber < meleeWeapons.size()) {
   return meleeWeapons.get(weaponNumber).damage();
  }
 return 0;
}
public int dealRangedDamage(int weaponNumber) {
  if(weaponNumber >= 0 && weaponNumber < rangedWeapons.size()) {
   return rangedWeapons.get(weaponNumber).damage();
  }
 return 0;
}

public ArrayList<MeleeWeapon> getMeleeWeapons() {
  return meleeWeapons;
}
public ArrayList<RangedWeapon> getRangedWeapons() {
  return rangedWeapons;
}

public int getStrength() {
  return strength;
}
public int getConstitution() {
  return constitution;
}
public int getDexterity() {
  return dexterity;
}
public int getSpeed() {
  return speed;
}
public int getWizardry() {
  return wizardry;
}
public int getDefenseValue() {
  return defenseValue;
}
public int getHealRate() {
  return healRate;
}

 // returns amount of damage actually taken
public int takeDamage(int damage){
 damage = Math.abs(damage) - defenseValue;
 if(damage > 0) {
  constitution -= damage;
  return damage;
}
return -1;
}
public int heal(){
 constitution += healRate;
 return healRate;
}

 // this function will be called whenever you try to print this object
public String toString() {
  return name;
}

protected String name;
protected ArrayList<MeleeWeapon> meleeWeapons;
protected ArrayList<RangedWeapon> rangedWeapons;
protected ArrayList<Spell> spells;
protected int defenseValue, healRate;
protected int strength, constitution, dexterity, speed, wizardry, intelligence;
}