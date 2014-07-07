import java.util.ArrayList;
public class CombatNode extends Node {
  public void startCombat(){
    enemies = -1; //make a good enemy number generator
    normalMonsters = (int)(enemies * .85);
    specialMonsters = (int)(enemies * .15);
  }
  public int getEnemies() {
    return enemies;
  }
  public int killEnemies() {
    enemies--;
    return enemies;
  }
  public boolean combatOver() {
    return (enemies <= 0);
  }
  public int addEnemies(int numSummoned){
    return (enemies + numSummoned);
  }
  public int xp (int monsterRating){ //monsterRating should be the average monsterRating of the monsters in the combat
    return ( monsterRating * enemies );
  }
  private int enemies = 0;
  private int normalMonsters = 0;
  private int specialMonsters = 0;
  private String[] SpecialMonsters = {"Armoured Skeleton","Flame Archer","Skeletal Wizard"};
  private String[] NormalMonsters = {"Skeleton","Skeleton Archer","Zombie"};
}



