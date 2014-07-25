import java.util.Arrays;
import java.util.ArrayList;

public abstract class Creature {
 public Creature(String tempName, MeleeWeapon[] tempMeleeWeapons, RangedWeapon[] tempRangedWeapons, Spell[] tempSpells, Armor[] tempArmor, int tempStrength, int tempConstitution, int tempDexterity, int tempSpeed, int tempWizardry, int tempIntelligence,  int tempHealRate, int tempGP) {
  name = tempName;
  meleeWeapons = new ArrayList<MeleeWeapon>(Arrays.asList(tempMeleeWeapons));
  rangedWeapons = new ArrayList<RangedWeapon>(Arrays.asList(tempRangedWeapons));
  spells = new ArrayList<Spell>(Arrays.asList(tempSpells));
  armor = new ArrayList<Armor>(Arrays.asList(tempArmor));
  strength = tempStrength;
  constitution = tempConstitution;
  dexterity = tempDexterity;
  speed = tempSpeed;
  wizardry = tempWizardry;
  intelligence = tempIntelligence;
  modifiedStrength = strength;
  modifiedConstitution = constitution;
  modifiedDexterity = dexterity;
  modifiedSpeed = speed;
  modifiedWizardry = wizardry;
  modifiedIntelligence = intelligence;
  healRate = tempHealRate;
  gp = tempGP;
}

public Damage dealMeleeDamage(int weaponNumber) {
  if(weaponNumber >= 0 && weaponNumber < getUsableMeleeAttacks().size()) {
   return getUsableMeleeAttacks().get(weaponNumber).damage(this);
  }
 return new Damage(0, 0);
}
public Damage dealRangedDamage(int weaponNumber) {
  if(weaponNumber >= 0 && weaponNumber < getUsableRangedAttacks().size()) {
   return getUsableRangedAttacks().get(weaponNumber).damage(this);
  }
 return new Damage(0, 0);
}

public ArrayList<MeleeWeapon> getMeleeWeapons() {
  return meleeWeapons;
}
public ArrayList<RangedWeapon> getRangedWeapons() {
  return rangedWeapons;
}
public ArrayList<Spell> getSpells() {
  return spells;
}
public ArrayList<Armor> getArmor() {
  return armor;
}
public ArrayList<MeleeWeapon> getUsableMeleeAttacks() {
  ArrayList<MeleeWeapon> returnList = new ArrayList<MeleeWeapon>();
  for(int i = 0; i < meleeWeapons.size(); i++) {
    if(meleeWeapons.get(i).canUse(this)) {
      returnList.add(meleeWeapons.get(i));
    }
  }
  if(returnList.size() == 0) {
    returnList.add(MakeMeleeWeapon.rock("normal"));
  }
  return returnList;
}
public ArrayList<RangedAttack> getUsableRangedAttacks() {
  ArrayList<RangedAttack> rangedAttacks = new ArrayList<RangedAttack>();
  rangedAttacks.addAll(rangedWeapons);
  rangedAttacks.addAll(spells);
  ArrayList<RangedAttack> returnList = new ArrayList<RangedAttack>();
  for(int i = 0; i < rangedAttacks.size(); i++) {
    if(rangedAttacks.get(i).canUse(this)) {
      returnList.add(rangedAttacks.get(i));
    }
  }
  if(returnList.size() == 0) {
    returnList.add(MakeRangedWeapon.rock("normal"));
  }
  return returnList;
}

public int getStrength() {
  return modifiedStrength;
}
public int getConstitution() {
  return modifiedConstitution;
}
public int getDexterity() {
  return modifiedDexterity;
}
public int getSpeed() {
  if (armor.size() > 0){
    return (modifiedSpeed - armor.get(0).getSpeedDebuff());
  }
  return speed;
}
public int getWizardry() {
  return modifiedWizardry;
}
public int getIntelligence() {
  return modifiedIntelligence;
}
public int getDefenseValue() {
  if (armor.size() > 0){
    return (armor.get(0).getDefenseValue());
  }
  return 0;
}
public int getHealRate() {
  return healRate;
}
public void reset(){
  modifiedStrength = strength;
  modifiedConstitution = constitution;
  modifiedDexterity = dexterity;
  modifiedSpeed = speed;
  modifiedWizardry = wizardry;
  modifiedIntelligence = intelligence;
}
public int castSpell(int wizCost) {
  return (modifiedWizardry -= wizCost);
}

 // returns amount of damage actually taken
public int takeDamage(Damage damage){
  int taken = damage.getBlockable() - armor.get(0).getDefenseValue();
  taken = taken > 0 ? taken : 0;
  taken += damage.getUnblockable();
  modifiedConstitution -= taken;
  return taken;
}
public int heal(){
 constitution += healRate;
 return healRate;
}

 // this function will be called whenever you try to print this object
public String toString() {
  return name;
}

public String toPluralString() {
  return name + "s";
}

public int getGP() {
  return gp;
}
public void setGP(int tempGP) {
  gp = tempGP;
}

protected String name;
protected ArrayList<MeleeWeapon> meleeWeapons;
protected ArrayList<RangedWeapon> rangedWeapons;
protected ArrayList<Spell> spells;
protected ArrayList<Armor> armor;
protected int healRate;
protected int strength, constitution, dexterity, speed, wizardry, intelligence;
protected int modifiedStrength, modifiedConstitution, modifiedDexterity, modifiedSpeed, modifiedWizardry, modifiedIntelligence;
protected int gp;
}