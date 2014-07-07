import java.util.ArrayList;

class RPG {
 public static void main(String[] args) {
  ArrayList<Monster> normal = new ArrayList<Monster>();
  normal.add(new Monster("Skeleton", new Weapon[]{new Weapon(3, 6, false)}, 6, 4, 0));
  normal.add(new Monster("Skeleton Archer", new Weapon[]{new Weapon(3, 6, true)}, 6, 4, 0));
  normal.add(new Monster("Zombie", new Weapon[]{new Weapon(3, 6, false)}, 6, 2, 0));

  ArrayList<Monster> special = new ArrayList<Monster>();
  special.add(new Monster("Armoured Skeleton", new Weapon[]{new Weapon(3, 6, false)}, 10, 4, 0));
  special.add(new Monster("Flame Archer", new Weapon[]{new Weapon(6, 6, true)}, 6, 4, 0));
  special.add(new Monster("Skeletal Wizard", new Weapon[]{new Weapon(5, 2, true)}, 2, 2, 0));

  CombatNode node = new CombatNode(special, normal);
  node.startCombat();
  ArrayList<Monster> monsters = node.monsterList();
  for(int i = 0; i < monsters.size(); i++) {
   System.out.println(monsters.get(i));
   }
  }
 }