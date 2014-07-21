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

  Player human = new Player("Rogue", "Joe", new MeleeWeapon[]{MakeMeleeWeapon.rapier(utils.playerAdjectives())}, new RangedWeapon[]{MakeRangedWeapon.crossbow(utils.playerAdjectives())}, new Spell[]{MakeSpell.frostBurn("annoying")}, 15, 13, 18, 12, 14, 8, 10, 7, 20, 0, 500);
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