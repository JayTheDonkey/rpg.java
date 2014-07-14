public abstract class Creature {
 public Creature(String tempName, MeleeWeapon[] tempMeleeWeapons, RangedWeapon[] tempRangedWeapons, int tempHealth, int tempDefenseValue, int tempAgility, int tempHealRate) {
  name = tempName;
  meleeWeapons = tempMeleeWeapons;
  rangedWeapons = tempRangedWeapons;
  health = tempHealth;
  defenseValue = tempDefenseValue;
  agility = tempAgility;
  healRate = tempHealRate;
  }
 public int dealMeleeDamage(int weaponNumber) {
  if(weaponNumber >= 0 && weaponNumber < meleeWeapons.length) {
   return meleeWeapons[weaponNumber].damage();
   }
  return 0;
  }
 public int dealRangedDamage(int weaponNumber) {
  if(weaponNumber >= 0 && weaponNumber < rangedWeapons.length) {
   return rangedWeapons[weaponNumber].damage();
   }
  return 0;
  }
 public int getHealth(){
   return health;
 }
 public Weapon getMeleeWeapon(int position){
   if(position >= 0 && position < meleeWeapons.length) {
     return meleeWeapons[position];
     }
   return null;
 }
 public Weapon getRangedWeapon(int position){
   if(position >= 0 && position < rangedWeapons.length) {
     return rangedWeapons[position];
     }
   return null;
 }
 public int numberOfMeleeWeapons() {
   return meleeWeapons.length;
 }
 public int numberOfRangedWeapons() {
   return rangedWeapons.length;
 }
 // returns amount of damage actually taken
 public int takeDamage(int damage){
   damage = Math.abs(damage) - defenseValue;
   if(damage > 0) {
    health -= damage;
    return damage;
    }
   return -1;
 }
 public int heal(){
   health += healRate;
   return healRate;
 }
 public int getAgility() {
   return agility;
   }

 // this function will be called whenever you try to print this object
 public String toString() {
  return name;
  }

 protected String name;
 protected MeleeWeapon[] meleeWeapons;
 protected RangedWeapon[] rangedWeapons;
 protected int defenseValue;
 protected int agility;
 protected int healRate;
 protected int health;
 }