import java.util.Arrays;
import java.util.ArrayList;

public class MakeMeleeWeapon {
 public static ArrayList<MeleeWeapon> getAll(){
  return new ArrayList<MeleeWeapon>(Arrays.asList(new MeleeWeapon[]{dirk("generic"),broadsword("generic"),falchion("generic"),greatSword("generic"),handAndAHalfSword("generic"),rapier("generic"),shortSword("generic"),axe("generic"),greatAxe("generic"),doubleBladedAxe("generic"),baton("generic"),club("generic"),flail("generic"),heavyFlail("generic"),warHammer("generic"),mace("generic"),morningstar("generic"), spear("generic"),footmansLance("generic"),longSpear("generic"),halfHalbard("generic"),halbard("generic"),poleaxe("generic"),brassKnuckles("generic"),talons("generic"),fists("generic"),rock("generic"),staff("generic")}));
 }
 public static MeleeWeapon dirk(String descriptor) {
  return new MeleeWeapon("dirk", descriptor, false, 2, 1, 1, 4, 18, false);
 }
 public static MeleeWeapon broadsword(String descriptor) {
  return new MeleeWeapon("broadsword", descriptor, false, 3, 4, 15, 10, 140, false);
 }
 public static MeleeWeapon falchion(String descriptor) {
  return new MeleeWeapon("falchion", descriptor, false, 4, 4, 12, 13, 150, false);
 }
 public static MeleeWeapon greatSword(String descriptor) {
  return new MeleeWeapon("great sword", descriptor, false, 6, 0, 21, 18, 240, true);
 }
 public static MeleeWeapon handAndAHalfSword(String descriptor) {
  return new MeleeWeapon("hand and a half sword", descriptor, false, 5, 0, 16, 12, 150, false);
 }
 public static MeleeWeapon rapier(String descriptor) {
  return new MeleeWeapon("rapier", descriptor, false, 3, 4, 10, 14, 160, false);
 }
 public static MeleeWeapon shortSword(String descriptor) {
  return new MeleeWeapon("short sword", descriptor, false, 3, 0, 7, 3, 35, false);
 }
 public static MeleeWeapon axe(String descriptor) {
  return new MeleeWeapon("axe", descriptor, false, 4, 0, 17, 8, 100, false);
 }
 public static MeleeWeapon greatAxe(String descriptor) {
  return new MeleeWeapon("great axe", descriptor, false, 5, 3, 20, 10, 110, true);
 }
 public static MeleeWeapon doubleBladedAxe(String descriptor) {
  return new MeleeWeapon("double bladed axe", descriptor, false, 6, 3, 21, 10, 140, true);
 }
 public static MeleeWeapon baton(String descriptor) {
  return new MeleeWeapon("baton", descriptor, false, 2, 0, 3, 2, 6, false);
 }
 public static MeleeWeapon club(String descriptor) {
  return new MeleeWeapon("club", descriptor, false, 3, 0, 5, 3, 15, false);
 }
 public static MeleeWeapon flail(String descriptor) {
  return new MeleeWeapon("flail", descriptor, false, 3, 4, 19, 13, 55, false);
 }
 public static MeleeWeapon heavyFlail(String descriptor) {
  return new MeleeWeapon("heavy flail", descriptor, false, 4, 4, 20, 15, 100, false);
 }
 public static MeleeWeapon warHammer(String descriptor) {
  return new MeleeWeapon("war hammer", descriptor, false, 5, 1, 16, 3, 85, false);
 }
 public static MeleeWeapon mace(String descriptor) {
  return new MeleeWeapon("mace", descriptor, false, 5, 2, 17, 3, 120, true);
 }
 public static MeleeWeapon morningstar(String descriptor) {
  return new MeleeWeapon("morningstar", descriptor, false, 5, 0, 17, 11, 140, false);
 }
 public static MeleeWeapon spear(String descriptor) {
  return new MeleeWeapon("spear", descriptor, false, 3, 1, 8, 8, 15, false);
 }
 public static MeleeWeapon footmansLance(String descriptor) {
  return new MeleeWeapon("footman's lance", descriptor, false, 4, 0, 10, 10, 40, true);
 }
 public static MeleeWeapon longSpear(String descriptor) {
  return new MeleeWeapon("long spear", descriptor, false, 5, 0, 12, 10, 40, true);
 }
 public static MeleeWeapon halfHalbard(String descriptor) {
  return new MeleeWeapon("half halbard", descriptor, false, 4, 1, 13, 9, 110, true);
 }
 public static MeleeWeapon halbard(String descriptor) {
  return new MeleeWeapon("halbard", descriptor, false, 6, 0, 16, 12, 200, true);
 }
 public static MeleeWeapon poleaxe(String descriptor) {
  return new MeleeWeapon("poleaxe", descriptor, false, 7, 0, 14, 13, 210, true);
 }
 public static MeleeWeapon brassKnuckles(String descriptor) {
  return new MeleeWeapon("brass knuckles", descriptor, true, 1, 2, 2, 3, 20, true);
 }
 public static MeleeWeapon talons(String descriptor) {
  return new MeleeWeapon("talons", descriptor, true, 0, 10, 2, 10, 30, false);
 }
 public static MeleeWeapon fists(String descriptor) {
  return new MeleeWeapon("fists", descriptor, true, 1, 0, 0, 0, 0, true);
 }
 public static MeleeWeapon rock(String descriptor) {
  return new MeleeWeapon("rock", descriptor, false, 1, 0, 0, 0, 0, false);
 }
 public static MeleeWeapon staff(String descriptor) {
  return new MeleeWeapon("staff", descriptor, false, 2, 0, 10, 8, 10, true);
 }
}