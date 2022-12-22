package HashMapImp.AddingElementInHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class AddingEle {
    public static void AddingElement(String args[]){
    
    // Create an empty hash map
        HashMap<Integer, String> nums = new HashMap<>();

    // Adding element in to the map
        nums.put(123, "ruth");
        nums.put(10, "Eli");
        nums.put(3, "Elija");
        nums.put(10, "Eli");

    // Printint the size and content
        System.out.println(nums);
        System.out.println(nums.size());

        
        /*for(Map.Entry<Integer, String> name : nums.entrySet());
            System.out.println(name.getKey() + " " + name.getValue());*/
    }
}
