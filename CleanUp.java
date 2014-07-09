import java.util.ArrayList;
public class CleanUp {
  public void simple(ArrayList<Monster> monsters){
    ArrayList<String> monsterNames = new ArrayList<String>();
    for (int i = 0; i < monsters.size(); i++){
      monsterNames.add((monsters.get(i).toString()));
    }
    ArrayList<String> names = new ArrayList<String>();
       ArrayList<Integer> number = new ArrayList<Integer>();
       while(monsters.size() > 0) {
           String current = monsterNames.remove(0);
           boolean exists = false;
           for(int i = 0; i < names.size(); i++) {
               if(names.get(i).equals(current)) {
                   number.set(i, number.get(i) + 1);
                   exists = true;
                   }
               }
           if(!exists) {
               names.add(current);
               number.add(1);
               }
           }
       
       for(int j = 0; j < names.size(); j++) {
           if(number.get(j) == 1) {
               System.out.println("1 " + names.get(j));
               }
           else {
               System.out.println(Integer.toString(number.get(j)) + " " + names.get(j) + "s");
               }
           }
       }
}
               
      
          
            
