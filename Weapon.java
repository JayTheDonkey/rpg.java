public class Weapon {
 public Weapon(String tempName, int tempDice, int tempAdds, boolean tempRanged) {
  dice = tempDice;
  adds = tempAdds;
  ranged = tempRanged;
  name = tempName;
  }

 public int damage() {
  int diceTotal = 0;
  for(int i = 0; i < dice; i++) {
   diceTotal += utils.random(1, 6);
   }
  return diceTotal + adds;
  }
 private String name;
 private int dice;
 private int adds;
 public boolean ranged;
}