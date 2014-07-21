import java.util.Arrays;
import java.util.ArrayList;

public class MakeRangedWeapon {
 public static ArrayList<RangedWeapon> getAll() {
  return new ArrayList<RangedWeapon>(Arrays.asList(new RangedWeapon[]{lightCrossbow(utils.playerAdjectives()),crossbow(utils.playerAdjectives()),heavyCrossbow(utils.playerAdjectives()),lightBow(utils.playerAdjectives()),bow(utils.playerAdjectives()),
              heavyBow(utils.playerAdjectives()),enchantedBow(utils.playerAdjectives()),sling(utils.playerAdjectives()),boomerang (utils.playerAdjectives()),throwingAxe(utils.playerAdjectives()),rock(utils.playerAdjectives())}));
 }
 public static RangedWeapon lightCrossbow(String descriptor) {
  return new RangedWeapon("light crossbow", descriptor, false, 3, -1, 8, 12, 20, 1);// find actual gold piece value
 }
 public static RangedWeapon crossbow(String descriptor) {
  return new RangedWeapon("crossbow", descriptor, false, 4, 0, 12, 10, 20, 1);// find actual gold piece value
 }
 public static RangedWeapon heavyCrossbow(String descriptor) {
  return new RangedWeapon("heavy crossbow", descriptor, false, 5, 0, 15, 10, 20, 1);// find actual gold piece value
 }
 public static RangedWeapon lightBow(String descriptor) {
  return new RangedWeapon("light bow", descriptor, false, 4, 3, 15, 15, 20, 1);// find actual gold piece value
 }
 public static RangedWeapon bow(String descriptor) {
  return new RangedWeapon("bow", descriptor, false, 5, 3, 20, 16, 20, 1);// find actual gold piece value
 }
 public static RangedWeapon heavyBow(String descriptor) {
  return new RangedWeapon("heavy bow", descriptor, false, 6, 3, 25, 17, 20, 1);// find actual gold piece value
 }
 public static RangedWeapon enchantedBow(String descriptor) {
  return new RangedWeapon("enchanted bow", descriptor, false, 6, 5, 15, 18, 20, 1);// find actual gold piece value
 }
 public static RangedWeapon sling(String descriptor) {
  return new RangedWeapon("sling", descriptor, false, 2, 0, 5, 10, 0, 1);// find actual gold piece value
 }
 public static RangedWeapon boomerang(String descriptor) {
  return new RangedWeapon("boomerang", descriptor, false, 2, 3, 11, 11, 0, 1);// find actual gold piece value
 }
 public static RangedWeapon throwingAxe(String descriptor) {
  return new RangedWeapon("throwing axe", descriptor, false, 3, 2, 9, 12, 1, 1);// find actual gold piece value
 }
 public static RangedWeapon rock(String descriptor) {
  return new RangedWeapon("rock", descriptor, false, 1, 0, 0, 0, 0, 1);// find actual gold piece value
 }
}