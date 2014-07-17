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
public Damage damage(Creature c) {
  if(canUse(c)) {
    int diceTotal = 0;
    int spite = 0;
    int temp = 0;
    for(int i = 0; i < dice; i++) {
      diceTotal += (temp = utils.random(1, 6));
      if(temp == 6) {
        spite++;
      }
    }
    return new Damage(diceTotal + adds, spite);
  }
  return new Damage(0, 0);
}
private String name;
private int dice, adds;
}