public abstract class Attack {
 public Attack(String tempName, String tempDescriptor, boolean tempPlural, int tempDice, int tempAdds) {
  dice = tempDice;
  adds = tempAdds;
  name = tempName;
  descriptor = tempDescriptor;
  plural = tempPlural;
}
public String toString() {
  if(plural) {
    return toPluralString();
  }
  return "a " + descriptor + " " + name;
}
public String toPluralString() {
  if(plural) {
    return descriptor + " " + name;
  }
  return descriptor + " " + name + "s";
}
public abstract boolean canUse(Creature c);
public Damage damage(Creature c) {
  if(canUse(c)) {
    int diceTotal = 0;
    int spite = 0;
    int temp = 0;
    for(int i = 0; i < dice; i++) {
      diceTotal += (temp = utils.random(1, 7));
      if(temp == 6) {
        spite++;
      }
    }
    return new Damage(diceTotal + adds, spite);
  }
  return new Damage(0, 0);
}
private String name, descriptor;
private boolean plural;
private int dice, adds;
}