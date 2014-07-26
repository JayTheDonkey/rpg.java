public abstract class Attack {
 public Attack(String tempName, String tempDescriptor, boolean tempPlural, int tempDice, int tempAdds, int tempPrice, boolean tempTwoHands) {
  dice = tempDice;
  adds = tempAdds;
  name = tempName;
  descriptor = tempDescriptor;
  plural = tempPlural;
  price = tempPrice;
  twoHands = tempTwoHands;
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

public String getName() {
  return name;
}
public String getDescriptor() {
  return descriptor;
}
public boolean isPlural() {
  return plural;
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
public int getDice() {
  return dice;
}
public int getAdds() {
  return adds;
}
public int getPrice(){
  return price;
}
public boolean isTwoHanded() {
  return twoHands;
}

private String name, descriptor;
private boolean plural;
private int dice, adds;
private int price;
private boolean twoHands;
}