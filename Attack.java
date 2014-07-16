public abstract class Attack {
 public Attack(String tempName, int tempDice, int tempAdds) {
  dice = tempDice;
  adds = tempAdds;
  name = tempName;
}
public String toString() {
  return name;
}
public abstract boolean canUse(Creature c);
public int damage(Creature c) {
  if(canUse(c)) {
    int diceTotal = 0;
    for(int i = 0; i < dice; i++) {
      diceTotal += utils.random(1, 6);
    }
    return diceTotal + adds;
  }
  return 0;
}
private String name;
private int dice, adds;
}