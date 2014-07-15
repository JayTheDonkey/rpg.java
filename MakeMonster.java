public class MakeMonster {
  public static Monster skeleton() {
    return new Monster("Skeleton", new MeleeWeapon[]{MakeMeleeWeapon.sword("rusty")}, new RangedWeapon[]{MakeRangedWeapon.rock("boring")}, 20, 6, 4, 0, 15);
   }
 public static Monster skeletonArcher() {
   return new Monster("Skeleton Archer", new MeleeWeapon[]{MakeMeleeWeapon.brassKnuckles("old")}, new RangedWeapon[]{MakeRangedWeapon.bow("rotten")}, 10, 6, 4, 0, 17);
  }
 public static Monster zombie() {
  return new Monster("Zombie", new MeleeWeapon[]{MakeMeleeWeapon.talons("jagged")}, new RangedWeapon[]{MakeRangedWeapon.rock("moss-covered")}, 25, 6, 2, 0, 20);
  }
 public static Monster armouredSkeleton() {
  return new Monster("Armoured Skeleton", new MeleeWeapon[]{MakeMeleeWeapon.axe("rusty")}, new RangedWeapon[]{MakeRangedWeapon.rock("iron")}, 30, 10, 4, 0, 25);
  }
 public static Monster flameArcher() {
   return new Monster("Flame Archer", new MeleeWeapon[]{MakeMeleeWeapon.stick("flaming")}, new RangedWeapon[]{MakeRangedWeapon.enchantedBow("flaming")}, 12, 6, 4, 0, 20);
  }
  public static Monster skeletalWizard() {
   return new Monster("Skeletal Wizard", new MeleeWeapon[]{MakeMeleeWeapon.staff("magic")}, new RangedWeapon[]{MakeRangedWeapon.fireball("large"), MakeRangedWeapon.ratSwarm("chittering")}, 8, 2, 2, 0, 30);
   }
  }