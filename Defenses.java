public class Defenses {
 public Defenses(String tempName, String tempDescriptor, int tempMinDex, int tempMinStr, int tempDefenseValue, int tempPrice, int tempDexDebuff, int tempSpeedDebuff, int tempMagicResistance) {
  name = tempName;
  descriptor = tempDescriptor;
  minDex = tempMinDex;
  minStr = tempMinStr;
  defenseValue = tempDefenseValue;
  price = tempPrice;
  dexDebuff = tempDexDebuff;
  speedDebuff = tempSpeedDebuff;
  magicResistance = tempMagicResistance;
}
public String toString(){
  return ("a " + descriptor + " " + name);
}
public String getName() {
  return name;
}
public String getDescriptor() {
  return descriptor;
}
public int getMinDex(){
  return minDex;
}
public int getMinStr(){
  return minStr;
}
public int getDefenseValue(){
  return defenseValue;
}
public int getPrice(){
  return price;
}
public int getMagicResistance(){
  return magicResistance;
}
public int getDexDebuff(){
  return dexDebuff;
}
public int getSpeedDebuff(){
  return speedDebuff;
}
public boolean canUse(Creature c) {
  return (c.getStrength() >= minStr && c.getDexterity() >= minDex);
}
protected String name;
protected String descriptor;
protected int minDex;
protected int minStr;
protected int defenseValue;
protected int price;
protected int dexDebuff;
protected int speedDebuff;
protected int magicResistance;
}
