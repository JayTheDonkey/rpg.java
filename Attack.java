public abstract class Attack {
 public Attack(String tempName, int tempDice, int tempAdds) {
  dice = tempDice;
  adds = tempAdds;
  name = tempName;
  }
 public String toString() {
  return name;
  }
 public int damage() {
  int diceTotal = 0;
  for(int i = 0; i < dice; i++) {
   diceTotal += utils.random(1, 6);
   }
  return diceTotal + adds;
  }
 private String name;
 private int dice, adds;
}