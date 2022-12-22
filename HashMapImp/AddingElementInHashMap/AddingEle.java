package HashMapImp.AddingElementInHashMap;

import java.util.HashMap;
import java.util.Map;

public class AddingEle {
    public static void AddingElement(String args[]){
    
    // Create an empty hash map
        HashMap<String, Integer> nums = new HashMap<>();

    // Adding element in to the map
        nums.put("ruth", 5);
        nums.put("Eli", 3);
        nums.put("Elija", 3);
        nums.put("Eli", 10);

    // Printint the size and content
        System.out.println(nums);
        System.out.println(nums.size());

    // Iterating over HashMap
    for(Map.Entry<String, Integer>name : nums.entrySet())
        System.out.println(name.getKey() + " " + name.getValue());
    }
}
