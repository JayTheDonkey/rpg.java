public class Monster extends Creature {
 public Monster(String tempName, Weapon[] tempWeapons, int tempDefenseValue, int tempAgility, int tempHealRate, int tempMonsterRating) {
  super(tempName, tempWeapons, tempDefenseValue, tempAgility, tempHealRate);
  monsterRating = tempMonsterRating;
  }
 
 public int getMonsterRating() {
   return monsterRating;
   }
 
 private int monsterRating;
 }