public class Effects {
 public Effects (String tempName, int tempStrMod, int tempDexMod, int tempWizMod, int tempIntMod, int tempConMod, int tempSpdMod, int tempChMod, int tempLkMod) {
  name = tempName;
  strMod = tempStrMod;
  dexMod = tempDexMod;
  wizMod = tempWizMod;
  intMod = tempIntMod;
  conMod = tempConMod;
  spdMod = tempSpdMod;
  chMod = tempChMod;
  lkMod = tempLkMod;
 }
 public String toString(){
  return name;
 }
 public int filterStr(int intialStr){
  return (intialStr + strMod);
 }
 public int filterDex(int intialDex){
  return (intialDex + dexMod);
 }
 public int filterWiz(int intialWiz){
  return (intialWiz + wizMod);
 }
 public int filterInt(int intialInt){
  return (intialInt + intMod);
 }
 public int filterCon(int intialCon){
  return (intialCon + conMod);
 }
 public int filterSpd(int intialSpd){
  return (intialSpd + spdMod);
 }
 public int filterCh(int intialCh){
  return (intialCh + chMod);
 }
 public int filterLuck(int intialLk){
  return (intialLk + lkMod);
 }
 protected String name;
 protected int strMod, dexMod, wizMod, intMod, conMod, spdMod, lkMod, chMod;
}



