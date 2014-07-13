import java.util.ArrayList;

class RPG {
 public  static boolean combat(Player p, CombatNode node){
   node.startCombat();
   ArrayList<Monster> monsters = node.monsterList();
   utils.printMonsters(monsters);
  
   Node next = node.getNext();
   next = next.getNext();
   System.out.println(next);
   return true;
 }
 public static void main(String[] args) {
  ArrayList<Monster> normal = new ArrayList<Monster>();
  normal.add(new Monster("Skeleton", new Weapon[]{new Weapon("Rusty Sword",3, 6, false)}, 6, 4, 0, 15));
  normal.add(new Monster("Skeleton Archer", new Weapon[]{new Weapon("Rotten Bow",3, 6, true)}, 6, 4, 0, 17));
  normal.add(new Monster("Zombie", new Weapon[]{new Weapon("Jagged Talons",3, 6, false)}, 6, 2, 0, 20));

  ArrayList<Monster> special = new ArrayList<Monster>();
  special.add(new Monster("Armoured Skeleton", new Weapon[]{new Weapon("Axe",3, 6, false)}, 10, 4, 0, 25));
  special.add(new Monster("Flame Archer", new Weapon[]{new Weapon("Enchanted Bow",6, 6, true)}, 6, 4, 0, 20));
  special.add(new Monster("Skeletal Wizard", new Weapon[]{new Weapon("Magic Staff",5, 2, true)}, 2, 2, 0, 30));
  
  Player human = new Player("Seal Clubber", "Jarrel", new Weapon[]{new Weapon("Club",3, 6, false)}, 9001, 1, 0);
  System.out.println(human);
  EndNode flee = new EndNode("You live happily ever after...Coward!");
  EndNode fight = new EndNode("And then you died...");
  ArrayList<Node> endings = new ArrayList();
  endings.add(flee);
  endings.add(fight);
  ArrayList<String> menu = new ArrayList();
  menu.add("flee");
  menu.add("fight");
  PlayerDecisionNode decision = new PlayerDecisionNode(endings, menu);
  CombatNode node = new CombatNode(special, normal, 3, 8, decision);
  
  combat(human, node);
  }
 }