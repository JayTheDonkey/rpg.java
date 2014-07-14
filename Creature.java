public abstract class Creature {
 public Creature(String tempName, Weapon[] tempWeapons, int tempHealth, int tempDefenseValue, int tempAgility, int tempHealRate) {
  name = tempName;
  weapons = tempWeapons;
  health = tempHealth;
  defenseValue = tempDefenseValue;
  agility = tempAgility;
  healRate = tempHealRate;
  }

 public int dealDamage(int weaponNumber) {
  if(weaponNumber >= 0 && weaponNumber < weapons.length) {
   return weapons[weaponNumber].damage();
   }
  return 0;
  }
 public int getHealth(){
   return health;
 }
 public Weapon getWeapon(int position){
   if(position >= 0 && position < weapons.length) {
     return weapons[position];
     }
   return null;
 }
 public int numberOfWeapons() {
   return weapons.length;
 }
 public int takeDamage(int damage){
   damage = Math.abs(damage) - defenseValue;
   if(damage > 0) {
    health -= damage;
    }
   return health;
 }
 public int heal(){
   health += healRate;
   return health;
 }
   

 // this function will be called whenever you try to print this object
 public String toString() {
  return name;
  }

 protected String name;
 protected Weapon[] weapons;
 protected int defenseValue;
 protected int agility;
 protected int healRate;
 protected int health;
 }