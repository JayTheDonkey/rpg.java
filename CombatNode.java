import java.util.ArrayList;

public class CombatNode extends Node {
  public CombatNode(ArrayList<Monster> tempListSpecial, ArrayList<Monster> tempListNormal, int tempMinMonsters, int tempMaxMonsters, Node tempWinNext, Node tempLoseNext, boolean tempStartAtRange) {
    super();
    listSpecial = tempListSpecial;
    listNormal = tempListNormal;
    minMonsters = tempMinMonsters;
    maxMonsters = tempMaxMonsters;
    winNext = tempWinNext;
    loseNext = tempLoseNext;
    startAtRange = tempStartAtRange;
    }
  public void startCombat(){
    enemies = utils.random(minMonsters, maxMonsters); //make a good enemy number generator
    normalMonsters = (int)(enemies * .85);
    specialMonsters = (int)(enemies - normalMonsters);
  }
  //creates an arraylist of all the monsters starting in the combat
  public ArrayList<Monster> monsterList(){
    ArrayList<Monster> monsterList = new ArrayList<Monster>();
    while (specialMonsters != 0){
      monsterList.add(listSpecial.get(utils.random(1,3)));
      specialMonsters--;}
    while (normalMonsters !=0){
      monsterList.add(listNormal.get(utils.random(1,3)));
      normalMonsters--;}
    return monsterList;
  }

  public int getEnemies() {
    return enemies;
  }
  public int killEnemies() {
    enemies--;
    return enemies;
  }
  //checks to see if combat is over
  public boolean combatOver() {
    return (enemies <= 0);
  }
  //adds enemies to the fighting force
  public int addEnemies(int numSummoned){
    return (enemies + numSummoned);
  }

  public Node process(Player p) {
    if(Combat.run(p, this, startAtRange)) {
      return winNext;
      }
    return loseNext;
  }

  private int enemies = 0;
  private int normalMonsters = 0;
  private int specialMonsters = 0;
  private int minMonsters, maxMonsters;
  private ArrayList<Monster> listSpecial;
  private ArrayList<Monster> listNormal;
  private Node winNext, loseNext;
  private boolean startAtRange;
}



