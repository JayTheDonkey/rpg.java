public class Armor {
 public Armor(String tempName, String tempDescriptor, int tempMinDex, int tempMinStr, int tempDefenseValue, int tempPrice, int tempDexDebuff, int tempSpeedDebuff, int tempMagicResistance) {
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
  return ("a suit of " + descriptor + " " + name + " armor.");
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
private String name;
private String descriptor;
private int minDex;
private int minStr;
private int defenseValue;
private int price;
private int dexDebuff;
private int speedDebuff;
private int magicResistance;
}