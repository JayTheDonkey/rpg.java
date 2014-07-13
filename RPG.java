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
  normal.add(MakeMonster.skeleton());
  normal.add(MakeMonster.skeletonArcher());
  normal.add(MakeMonster.zombie());

  ArrayList<Monster> special = new ArrayList<Monster>();
  special.add(MakeMonster.armouredSkeleton());
  special.add(MakeMonster.flameArcher());
  special.add(MakeMonster.skeletalWizard());
  
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