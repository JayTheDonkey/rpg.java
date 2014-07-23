public class Monster extends Creature {
 public Monster(String tempName, MeleeWeapon[] tempMeleeWeapons, RangedWeapon[] tempRangedWeapons, Spell[] tempSpells, Armor[] tempArmor, int tempStrength, int tempConstitution, int tempDexterity, int tempSpeed, int tempWizardry, int tempIntelligence, int tempHealRate, int tempMonsterRating, int tempGP) {
    super(tempName, tempMeleeWeapons, tempRangedWeapons, tempSpells, tempArmor, tempStrength, tempConstitution, tempDexterity, tempSpeed, tempWizardry, tempIntelligence, tempHealRate, tempGP);
  monsterRating = tempMonsterRating;
 }

 public int getMonsterRating() {
  return monsterRating;
 }

 private int monsterRating;
}