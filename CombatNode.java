public class CombatNode extends Node {
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

  private int enemies = -1 //add an equation to randomly generate enemies
}