package HashMapImp.ContainsValueGet;

import java.util.HashMap;

public class ValueGet {
    public static void contain(String args[]){
        
    // Creting an empty map
        HashMap<String, Integer> number = new HashMap<>();

        number.put("Ruth", 2);
        number.put("Eli", 4);
        number.put("Elija", 3);
        number.put("Elija", 6);

        if(number.containsValue(3)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        number.get("Elija");
        System.out.println(number);
    }
}
