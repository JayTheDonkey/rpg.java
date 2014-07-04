public class Shortcut {
  /* creates a shorter way to do System.out.println, using the constructor Shortcut s = new Shortcut(); 
   * using s as the object in the constructor is recomended, because it makes the shortcut be s.print
   * public "print" could be shortened further to "prt" or just "p"
   */
  public String print(String phrase){
    System.out.println(phrase);
    return phrase;
  }
}