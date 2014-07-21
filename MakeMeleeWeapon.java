import java.util.Arrays;
import java.util.ArrayList;

public class MakeMeleeWeapon {
 public static ArrayList<MeleeWeapon> getAll(){
  return new ArrayList<MeleeWeapon>(Arrays.asList(new MeleeWeapon[]{dirk(utils.playerAdjectives()),broadsword(utils.playerAdjectives()),falchion(utils.playerAdjectives()),greatSword(utils.playerAdjectives()),handAndAHalfSword(utils.playerAdjectives()),rapier(utils.playerAdjectives()),shortSword(utils.playerAdjectives()),axe(utils.playerAdjectives()),
     greatAxe(utils.playerAdjectives()),doubleBladedAxe(utils.playerAdjectives()),baton(utils.playerAdjectives()),club(utils.playerAdjectives()),flail(utils.playerAdjectives()),heavyFlail(utils.playerAdjectives()),warHammer(utils.playerAdjectives()),mace(utils.playerAdjectives()),morningstar(utils.playerAdjectives()), spear(utils.playerAdjectives()),
     footmansLance(utils.playerAdjectives()),longSpear(utils.playerAdjectives()),halfHalbard(utils.playerAdjectives()),halbard(utils.playerAdjectives()),poleaxe(utils.playerAdjectives()),brassKnuckles(utils.monsterAdjective()),talons(utils.monsterAdjective()),fists(utils.monsterAdjective()),rock(utils.monsterAdjective()),staff(utils.playerAdjectives())}));
 }
 public static MeleeWeapon dirk(String descriptor) {
  return new MeleeWeapon("dirk", descriptor, false, 2, 1, 1, 4, 1); // find actual gold piece value
 }
 public static MeleeWeapon broadsword(String descriptor) {
  return new MeleeWeapon("broadsword", descriptor, false, 3, 4, 15, 10, 1);// find actual gold piece value
 }
 public static MeleeWeapon falchion(String descriptor) {
  return new MeleeWeapon("falchion", descriptor, false, 4, 4, 12, 13, 1);// find actual gold piece value
 }
 public static MeleeWeapon greatSword(String descriptor) {
  return new MeleeWeapon("great sword", descriptor, false, 6, 0, 21, 18, 1);// find actual gold piece value
 }
 public static MeleeWeapon handAndAHalfSword(String descriptor) {
  return new MeleeWeapon("hand and a half sword", descriptor, false, 5, 0, 16, 12, 1);// find actual gold piece value
 }
 public static MeleeWeapon rapier(String descriptor) {
  return new MeleeWeapon("rapier", descriptor, false, 3, 4, 10, 14, 1);// find actual gold piece value
 }
 public static MeleeWeapon shortSword(String descriptor) {
  return new MeleeWeapon("short sword", descriptor, false, 3, 0, 7, 3, 1);// find actual gold piece value
 }
 public static MeleeWeapon axe(String descriptor) {
  return new MeleeWeapon("axe", descriptor, false, 4, 0, 17, 8, 1);// find actual gold piece value
 }
 public static MeleeWeapon greatAxe(String descriptor) {
  return new MeleeWeapon("great axe", descriptor, false, 5, 3, 20, 10, 1);// find actual gold piece value
 }
 public static MeleeWeapon doubleBladedAxe(String descriptor) {
  return new MeleeWeapon("double bladed axe", descriptor, false, 6, 3, 21, 10, 1);// find actual gold piece value
 }
 public static MeleeWeapon baton(String descriptor) {
  return new MeleeWeapon("baton", descriptor, false, 2, 0, 3, 2, 1);// find actual gold piece value
 }
 public static MeleeWeapon club(String descriptor) {
  return new MeleeWeapon("club", descriptor, false, 3, 0, 5, 3, 1);// find actual gold piece value
 }
 public static MeleeWeapon flail(String descriptor) {
  return new MeleeWeapon("flail", descriptor, false, 3, 4, 19, 13, 1);// find actual gold piece value
 }
 public static MeleeWeapon heavyFlail(String descriptor) {
  return new MeleeWeapon("heavy flail", descriptor, false, 4, 4, 20, 15, 1);// find actual gold piece value
 }
 public static MeleeWeapon warHammer(String descriptor) {
  return new MeleeWeapon("war hammer", descriptor, false, 5, 1, 16, 3, 1);// find actual gold piece value
 }
 public static MeleeWeapon mace(String descriptor) {
  return new MeleeWeapon("mace", descriptor, false, 5, 2, 17, 3, 1);// find actual gold piece value
 }
 public static MeleeWeapon morningstar(String descriptor) {
  return new MeleeWeapon("morningstar", descriptor, false, 5, 0, 17, 11, 1);// find actual gold piece value
 }
 public static MeleeWeapon spear(String descriptor) {
  return new MeleeWeapon("spear", descriptor, false, 3, 1, 8, 8, 1);// find actual gold piece value
 }
 public static MeleeWeapon footmansLance(String descriptor) {
  return new MeleeWeapon("footman's lance", descriptor, false, 4, 0, 10, 10, 1);// find actual gold piece value
 }
 public static MeleeWeapon longSpear(String descriptor) {
  return new MeleeWeapon("long spear", descriptor, false, 5, 0, 12, 10, 1);// find actual gold piece value
 }
 public static MeleeWeapon halfHalbard(String descriptor) {
  return new MeleeWeapon("half halbard", descriptor, false, 4, 1, 13, 9, 1);// find actual gold piece value
 }
 public static MeleeWeapon halbard(String descriptor) {
  return new MeleeWeapon("halbard", descriptor, false, 6, 0, 16, 12, 1);// find actual gold piece value
 }
 public static MeleeWeapon poleaxe(String descriptor) {
  return new MeleeWeapon("poleaxe", descriptor, false, 7, 0, 14, 13, 1);// find actual gold piece value
 }
 public static MeleeWeapon brassKnuckles(String descriptor) {
  return new MeleeWeapon("brass knuckles", descriptor, true, 1, 2, 2, 3, 1);// find actual gold piece value
 }
 public static MeleeWeapon talons(String descriptor) {
  return new MeleeWeapon("talons", descriptor, true, 0, 10, 2, 10, 1);// find actual gold piece value
 }
 public static MeleeWeapon fists(String descriptor) {
  return new MeleeWeapon("fists", descriptor, true, 1, 0, 0, 0, 1);// find actual gold piece value
 }
 public static MeleeWeapon rock(String descriptor) {
  return new MeleeWeapon("rock", descriptor, false, 1, 0, 0, 0, 1);// find actual gold piece value
 }
 public static MeleeWeapon staff(String descriptor) {
  return new MeleeWeapon("staff", descriptor, false, 2, 0, 10, 8, 1);// find actual gold piece value
 }
}