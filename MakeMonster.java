public class MakeMonster {
  public static Monster skeleton() {
   return new Monster("Skeleton", new Weapon[]{new Weapon("Rusty Sword", 3, 6, false)}, 6, 4, 0, 15);
   }
 public static Monster skeletonArcher() {
  return new Monster("Skeleton Archer", new Weapon[]{new Weapon("Rotten Bow", 3, 6, true)}, 6, 4, 0, 17);
  }
 public static Monster zombie() {
  return new Monster("Zombie", new Weapon[]{new Weapon("Jagged Talons", 3, 6, false)}, 6, 2, 0, 20);
  }
 public static Monster armouredSkeleton() {
  return new Monster("Armoured Skeleton", new Weapon[]{new Weapon("Axe", 3, 6, false)}, 10, 4, 0, 25);
  }
 public static Monster flameArcher() {
  return new Monster("Flame Archer", new Weapon[]{new Weapon("Enchanted Bow", 6, 6, true)}, 6, 4, 0, 20);
  }
  public static Monster skeletalWizard() {
   return new Monster("Skeletal Wizard", new Weapon[]{new Weapon("Magic Staff", 5, 2, true)}, 2, 2, 0, 30);
   }
  }