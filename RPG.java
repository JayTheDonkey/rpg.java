import java.util.ArrayList;

class RPG {
  public static void main(String[] args) {
    ArrayList<Monster> normal = new ArrayList<Monster>();
    normal.add(MakeMonster.skeleton());
    normal.add(MakeMonster.skeletonArcher());
    normal.add(MakeMonster.zombie());

    ArrayList<Monster> special = new ArrayList<Monster>();
    special.add(MakeMonster.armouredSkeleton());
    special.add(MakeMonster.flameArcher());
    special.add(MakeMonster.skeletalWizard());

    Player human = Setup.createPlayer();

    EndNode goodEnding = new EndNode(new String[] {"...and you live happily ever after"});
    EndNode badEnding = new EndNode(new String[] {"...and then you died"});
    CombatNode combat = new CombatNode(special, normal, 3, 8, goodEnding, badEnding, true);
    PlayerDecisionNode stillContinue = new PlayerDecisionNode(new String[] {"fight anyway", "run away like a sissy"}, new Node[] {badEnding, goodEnding});
    FlavorNode warning = new FlavorNode(new String[] {"you're primary stat is not very high. are you sure you want to continue?"}, stillContinue);
    ComputerDecisionNode test = new ComputerDecisionNode(new Node[]{combat, warning}, p -> {
        if((p.getClassName() == "Rogue" && p.getDexterity() < 15) || (p.getClassName() == "Warrior" && p.getStrength() < 15) || (p.getClassName().equals("Wizard") && p.getWizardry() < 15) || (p.getClassName().equals("Cleric") && p.getConstitution() < 15)) {
            return warning;
        }
        return combat;
    });
    PlayerDecisionNode choice = new PlayerDecisionNode(new String[] {"wander away to some more interesting part of the world", "investigate the noise"}, new Node[] {badEnding, test});
    FlavorNode start = new FlavorNode(new String[] {"you are in front of a cave", "its pretty much like every other cave you've ever seen", "in fact, its so generic you quickly become bored", "even a *mysterious noise* cannot hold your attention for long"}, choice);

    Save.write("save1", new GameState(choice.getID(), human));

    Node current = start;
    while((current = current.process(human)) != null) {}

    UI.out.println("\nLoading game from JSON file, starting at choice node\n");

    GameState loaded = Save.read("save1");

    human = loaded.getPlayer();
    current = Node.getNodeByID(loaded.getNodeID());

    while((current = current.process(human)) != null) {}
  }
}
