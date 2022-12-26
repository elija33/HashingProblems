package LongestSubarrayGivenSum;

import java.util.HashMap;

public class SubarrayGiveSum {
    public static int longestSubarray(int nums[], int target){
        HashMap<Integer, Integer> number = new HashMap<>();
        int sum = 0;
        int maxNumber = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(sum == target)
                maxNumber = i + 1;
            if(!number.containsKey(sum)){
                number.put(sum, i);
            }

            if(number.containsKey(sum - target)){
                if(maxNumber < (i - number.get(sum - target)))
                    maxNumber = i - number.get(sum - target);
            }
        }
        return maxNumber;
    }
    public static void main(String[] args) {
        int number[] = {5, 8, -4, -4, 9, -2, 2};
        int target = 0;
        System.out.println(longestSubarray(number, target));
    }
}
