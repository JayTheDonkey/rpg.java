public class Armor {
 public Armor(String tempName, String tempDescriptor, int tempMinDex, int tempMinStr, int tempDefenceValue, int tempPrice, int tempDexDebuff, int tempSpeedDebuff, int tempMagicResistance) {
  String name = tempName;
  String descriptor = tempDescriptor;
  int minDex = tempMinDex;
  int minStr = tempMinStr;
  int defenceValue = tempDefenceValue;
  int price = tempPrice;
  int dexDebuff = tempDexDebuff;
  int speedDebuff = tempSpeedDebuff;
  int magicResistance = tempMagicResistance;
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
public int getDefenceValue(){
  return defenceValue;
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
private int defenceValue;
private int price;
private int dexDebuff;
private int speedDebuff;
private int magicResistance;
}