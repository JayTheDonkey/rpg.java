public class Armor extends Defenses{
  public Armor(String tempName, String tempDescriptor, int tempMinDex, int tempMinStr, int tempDefenseValue, int tempPrice, int tempDexDebuff, int tempSpeedDebuff, int tempMagicResistance) {
    super(tempName, tempDescriptor, tempMinDex, tempMinStr,  tempDefenseValue, tempPrice, tempDexDebuff,  tempSpeedDebuff, tempMagicResistance);
  }

  public String toString(){
    return ("a suit of " + descriptor + " " + name + " armor.");
  }
}

