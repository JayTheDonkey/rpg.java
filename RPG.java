import java.util.ArrayList;

class RPG {
public static void main(String[] args) {
  Setup.createPlayer();
  ArrayList<Monster> normal = new ArrayList<Monster>();
  normal.add(MakeMonster.skeleton());
  normal.add(MakeMonster.skeletonArcher());
  normal.add(MakeMonster.zombie());

  ArrayList<Monster> special = new ArrayList<Monster>();
  special.add(MakeMonster.armouredSkeleton());
  special.add(MakeMonster.flameArcher());
  special.add(MakeMonster.skeletalWizard());

  Player human = Setup.createPlayer();
  System.out.println("you are " + human + "\n");
  EndNode ending = new EndNode("...the end");
  CombatNode node = new CombatNode(special, normal, 3, 8, ending);

  if(Combat.run(human, node, true)) {
    utils.print("good job! you won!");
  }
  else {
    utils.print("you lost. loser.");
  }
  System.out.println(node.getNext());
}
}