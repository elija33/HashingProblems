package LongestSubarrayEqual0and1;

import java.util.HashMap;

public class Equal0And1 {
    public static int LongestEqual0and1(int nums[]){
        HashMap<Integer, Integer> num = new HashMap<>();
        int sum = 0;
        int maxNumber = 0;
        for(int i = 0; i < nums.length; i++)
            nums[i] = (nums[i] == 0) ? -1 : 1;

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(sum == 0)
            maxNumber = i + 1;

            if(num.containsKey(sum + nums.length) == true)
            {
                if(maxNumber < i - num.get(sum + nums.length))
                 maxNumber = i - num.get(sum + nums.length);
            }
            else
                num.put(sum + nums.length, i); 
        }
        return maxNumber;
    
    }
    public static void main(String[] args) {
        int number[] = {1, 1, 1, 0, 1, 0, 1, 1, 1};
        System.out.println(LongestEqual0and1(number));
    }
}
