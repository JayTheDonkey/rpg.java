import java.util.Arrays;
import java.util.ArrayList;

public class MakeRangedWeapon {
 public static ArrayList<RangedWeapon> getAll() {
  return new ArrayList<RangedWeapon>(Arrays.asList(new RangedWeapon[]{lightCrossbow("generic"),crossbow("generic"),heavyCrossbow("generic"),lightBow("generic"),bow("generic"),heavyBow("generic"),enchantedBow("generic"),sling("generic"),boomerang ("generic"),throwingAxe("generic"),rock("generic")}));
 }
 public static RangedWeapon lightCrossbow(String descriptor) {
  return new RangedWeapon("light crossbow", descriptor, false, 3, -1, 8, 12, 20, 150, false);
 }
 public static RangedWeapon crossbow(String descriptor) {
  return new RangedWeapon("crossbow", descriptor, false, 4, 0, 12, 10, 20, 170, true);
 }
 public static RangedWeapon heavyCrossbow(String descriptor) {
  return new RangedWeapon("heavy crossbow", descriptor, false, 5, 0, 15, 10, 20, 250, true);
 }
 public static RangedWeapon lightBow(String descriptor) {
  return new RangedWeapon("light bow", descriptor, false, 4, 3, 15, 15, 20, 100, true);
 }
 public static RangedWeapon bow(String descriptor) {
  return new RangedWeapon("bow", descriptor, false, 5, 3, 20, 16, 20, 175, true);
 }
 public static RangedWeapon heavyBow(String descriptor) {
  return new RangedWeapon("heavy bow", descriptor, false, 6, 3, 25, 17, 20, 250, true);
 }
 public static RangedWeapon enchantedBow(String descriptor) {
  return new RangedWeapon("enchanted bow", descriptor, false, 6, 5, 15, 18, 20, 500, true);
 }
 public static RangedWeapon sling(String descriptor) {
  return new RangedWeapon("sling", descriptor, false, 2, 0, 5, 10, 0, 5, false);
 }
 public static RangedWeapon boomerang(String descriptor) {
  return new RangedWeapon("boomerang", descriptor, false, 2, 3, 11, 11, 0, 50, false);
 }
 public static RangedWeapon throwingAxe(String descriptor) {
  return new RangedWeapon("throwing axe", descriptor, false, 3, 2, 9, 12, 1, 70, false);
 }
 public static RangedWeapon rock(String descriptor) {
  return new RangedWeapon("rock", descriptor, false, 1, 0, 0, 0, 0, 0, false);
 }
}