import java.util.ArrayList;

public class CombatNode extends Node {
  public CombatNode(ArrayList<Monster> tempListSpecial, ArrayList<Monster> tempListNormal) {
    listSpecial = tempListSpecial;
    listNormal = tempListNormal;
    }
  public void startCombat(){
    enemies = utils.random(7,16); //make a good enemy number generator
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
  //at the end of combat calculates and returns amount of xp the fight was worth
  public int giveXP (int monsterRating){ //monsterRating should be the average monsterRating of the monsters in the combat
    return ( monsterRating * enemies );
  }
  private int enemies = 0;
  private int normalMonsters = 0;
  private int specialMonsters = 0;
  private ArrayList<Monster> listSpecial;
  private ArrayList<Monster> listNormal;
}



