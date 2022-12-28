package MostFrequentEleArray;

import java.util.Map.Entry;
import java.util.HashMap;

public class FrequentElementArray {
    public static int ElementArray(int arr[]){
        
        HashMap<Integer, Integer> nums = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
             int count = arr[i];
            if(nums.containsKey(count)){
                int freq = nums.get(count);
                freq++;
                nums.put(count, freq);
            }
            else{
                nums.put(count, 1);
            }
        }
        int maxcount = 0;
        int res = -1;
        for(Entry<Integer, Integer> number : nums.entrySet()){
            if(maxcount < number.getValue()){
                res = number.getKey();
                maxcount = number.getValue();
            }
        }
       return res;
    }
    public static void main(String[] args) {
        int number[] = {50,40,50,30,40,50,30,50,30};
        System.out.println(ElementArray(number));
    }
}
