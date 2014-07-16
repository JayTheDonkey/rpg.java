public class MakeMonster {
  public static Monster skeleton() {
    return new Monster("Skeleton", new MeleeWeapon[]{MakeMeleeWeapon.shortSword("rusty")}, new RangedWeapon[]{MakeRangedWeapon.rock("boring")}, new Spell[]{}, 20, 6, 4, 0, 15);
  }
  public static Monster skeletonArcher() {
    return new Monster("Skeleton Archer", new MeleeWeapon[]{MakeMeleeWeapon.brassKnuckles("old")}, new RangedWeapon[]{MakeRangedWeapon.bow("rotten")}, new Spell[]{}, 10, 6, 4, 0, 17);
  }
  public static Monster zombie() {
    return new Monster("Zombie", new MeleeWeapon[]{MakeMeleeWeapon.talons("jagged")}, new RangedWeapon[]{MakeRangedWeapon.rock("moss-covered")}, new Spell[]{}, 25, 6, 2, 0, 20);
  }
  public static Monster armouredSkeleton() {
    return new Monster("Armoured Skeleton", new MeleeWeapon[]{MakeMeleeWeapon.axe("rusty")}, new RangedWeapon[]{MakeRangedWeapon.rock("iron")}, new Spell[]{}, 30, 10, 4, 0, 25);
  }
  public static Monster flameArcher() {
    return new Monster("Flame Archer", new MeleeWeapon[]{MakeMeleeWeapon.baton("flaming")}, new RangedWeapon[]{MakeRangedWeapon.enchantedBow("flaming")}, new Spell[]{}, 12, 6, 4, 0, 20);
  }
  public static Monster skeletalWizard() {
    return new Monster("Skeletal Wizard", new MeleeWeapon[]{MakeMeleeWeapon.staff("magic")}, new RangedWeapon[]{MakeRangedWeapon.rock("definately magical")}, new Spell[]{MakeSpell.fireball("large"), MakeSpell.ratSwarm("chittering")}, 8, 2, 2, 0, 30);
  }
}