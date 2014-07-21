public class MakeMonster {
  public static Monster skeleton() {
    return new Monster("Skeleton", new MeleeWeapon[]{MakeMeleeWeapon.shortSword(utils.monsterAdjective())}, new RangedWeapon[]{MakeRangedWeapon.rock(utils.monsterAdjective())}, new Spell[]{}, 14, 15, 14, 13, 2, 12, 10, 0, 15, 10);
  }
  public static Monster skeletonArcher() {
    return new Monster("Skeleton Archer", new MeleeWeapon[]{MakeMeleeWeapon.brassKnuckles(utils.monsterAdjective())}, new RangedWeapon[]{MakeRangedWeapon.lightBow(utils.monsterAdjective())}, new Spell[]{}, 15, 12, 16, 11, 2, 14, 5, 0, 15, 10);
  }
  public static Monster zombie() {
    return new Monster("Zombie", new MeleeWeapon[]{MakeMeleeWeapon.talons(utils.monsterAdjective())}, new RangedWeapon[]{MakeRangedWeapon.rock(utils.monsterAdjective())}, new Spell[]{}, 16, 30, 16, 15, 3, 10, 12, 0, 30, 5);
  }
  public static Monster armouredSkeleton() {
    return new Monster("Armoured Skeleton", new MeleeWeapon[]{MakeMeleeWeapon.axe(utils.monsterAdjective())}, new RangedWeapon[]{MakeRangedWeapon.rock(utils.monsterAdjective())}, new Spell[]{}, 14, 15, 14, 13, 2, 12, 21, 0, 20, 12);
  }
  public static Monster flameArcher() {
    return new Monster("Flame Archer", new MeleeWeapon[]{MakeMeleeWeapon.baton(utils.monsterAdjective())}, new RangedWeapon[]{MakeRangedWeapon.enchantedBow(utils.monsterAdjective())}, new Spell[]{}, 15, 13, 18, 11, 3, 12, 7, 0, 17, 12);
  }
  public static Monster skeletalWizard() {
    return new Monster("Skeletal Wizard", new MeleeWeapon[]{MakeMeleeWeapon.staff("super magical")}, new RangedWeapon[]{MakeRangedWeapon.rock("definately magical")}, new Spell[]{MakeSpell.fireball("large"), MakeSpell.ratSwarm("chittering")}, 13, 12, 12, 10, 15, 18, 3, 0, 17, 15);
  }
}