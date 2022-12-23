package FrequenciesArrayElements;

import java.util.HashMap;
import java.util.Map;

public class EfficiFrequenciesArray {
    public static void FrequenciesArray(int number[]){
        Map<Integer, Integer> nums = new HashMap<>();
        for(int i = 0; i < number.length; i++){
            int key = number[i];
            if(nums.containsKey(number[i]) == true)
                nums.put(number[i], nums.get(number[i]) + 1);
            
            else
                nums.put(number[i], 1);
            }
            for(Map.Entry<Integer, Integer> n : nums.entrySet())
            System.out.println(n.getKey() + " " + n.getValue());
        }
    
    public static void main(String[] args) {
        int number[] = new int[] {15, 16, 27, 27, 28, 15};
        FrequenciesArray(number);
    }
}