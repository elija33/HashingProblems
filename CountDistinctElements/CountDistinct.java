package CountDistinctElements;

import java.util.HashMap;
import java.util.HashSet;

public class CountDistinct {
    public static void distinct(int nums[], int giveNumber){
        HashMap<Integer, Integer> number = new HashMap<>();
        for(int i = 0; i < giveNumber; i++){
            number.put(nums[i], number.getOrDefault(nums[i], 0) + 1);
        }
        System.out.println(number.size()+ " ");

        for(int i = giveNumber; i < nums.length; i++){

            number.put(nums[i - giveNumber], number.get(nums[i - giveNumber]) - 1);
            if(number.get(nums[i - giveNumber]) == 0){
                number.remove(nums[i - giveNumber]);
            }
            number.put(nums[i], number.getOrDefault(nums[i], 0) + 1);

            System.out.println(number.size()+ " ");
        }
    }
    public static void main(String[] args) {
        int number[] = {15, 16, 27, 28, 17};
        int giveNumber = 4;
        distinct(number, giveNumber);
    }
}
