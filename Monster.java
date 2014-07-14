public class Monster extends Creature {
 public Monster(String tempName, MeleeWeapon[] tempMeleeWeapons, RangedWeapon[] tempRangedWeapons, int tempHealth, int tempDefenseValue, int tempAgility, int tempHealRate, int tempMonsterRating) {
  super(tempName, tempMeleeWeapons, tempRangedWeapons, tempHealth, tempDefenseValue, tempAgility, tempHealRate);
  monsterRating = tempMonsterRating;
  }
 
 public int getMonsterRating() {
   return monsterRating;
   }
 
 private int monsterRating;
 }