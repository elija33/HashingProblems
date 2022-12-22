package HashMapImp.RemoveEleContainsKey;

import java.util.HashMap;

public class ContainsKey {
    public static void Contains(String args[]){
    
    // Create an empty hash map
        HashMap<String, Integer> number = new HashMap<>();

    // Adding element into the map
        number.put("Ruth", 2);
        number.put("Elija", 3);
        number.put("Eli", 4);
        number.put("Ruth", 2);
    
    // Check for a key
        if(number.containsKey("Ruth")){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    // Remove key "Ruth" and returns the associated value 15.
        number.remove("Ruth");
        System.out.println(number);
        System.out.println(number.size());
    }
}
