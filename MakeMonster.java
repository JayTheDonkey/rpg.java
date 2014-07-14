public class MakeMonster {
  public static Monster skeleton() {
    return new Monster("Skeleton", new MeleeWeapon[]{new MeleeWeapon("a rusty sword", 3, 6)}, new RangedWeapon[]{new RangedWeapon("a rock", 1, -2)}, 20, 6, 4, 0, 15);
   }
 public static Monster skeletonArcher() {
   return new Monster("Skeleton Archer", new MeleeWeapon[]{new MeleeWeapon("knuckle bones", 1, 2)}, new RangedWeapon[]{new RangedWeapon("a rotten bow", 3, 6)}, 10, 6, 4, 0, 17);
  }
 public static Monster zombie() {
  return new Monster("Zombie", new MeleeWeapon[]{new MeleeWeapon("jagged talons", 3, 6)}, new RangedWeapon[]{new RangedWeapon("a rock", 1, -2)}, 25, 6, 2, 0, 20);
  }
 public static Monster armouredSkeleton() {
  return new Monster("Armoured Skeleton", new MeleeWeapon[]{new MeleeWeapon("an axe", 3, 6)}, new RangedWeapon[]{new RangedWeapon("a rock", 1, -2)}, 30, 10, 4, 0, 25);
  }
 public static Monster flameArcher() {
   return new Monster("Flame Archer", new MeleeWeapon[]{new MeleeWeapon("a flaming stick", 2, 0)}, new RangedWeapon[]{new RangedWeapon("an enchanted bow", 6, 6)}, 12, 6, 4, 0, 20);
  }
  public static Monster skeletalWizard() {
   return new Monster("Skeletal Wizard", new MeleeWeapon[]{new MeleeWeapon("knuckle bones", 1, 2)}, new RangedWeapon[]{new RangedWeapon("a magic staff", 5, 2)}, 8, 2, 2, 0, 30);
   }
  }