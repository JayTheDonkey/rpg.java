public class Monster extends Creature {
	public Monster(String tempName, MeleeWeapon[] tempMeleeWeapons, RangedWeapon[] tempRangedWeapons, Spell[] tempSpells, int tempStrength, int tempConstitution, int tempDexterity, int tempSpeed, int tempWizardry, int tempIntelligence, int tempDefenseValue, int tempHealRate, int tempMonsterRating) {
    super(tempName, tempMeleeWeapons, tempRangedWeapons, tempSpells, tempStrength, tempConstitution, tempDexterity, tempSpeed, tempWizardry, tempIntelligence, tempDefenseValue, tempHealRate);
		monsterRating = tempMonsterRating;
	}

	public int getMonsterRating() {
		return monsterRating;
	}

	private int monsterRating;
}