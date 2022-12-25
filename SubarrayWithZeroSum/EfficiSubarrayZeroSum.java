package SubarrayWithZeroSum;

import java.util.HashSet;

public class EfficiSubarrayZeroSum {
    public static boolean isSubarrayZero(int nums[]){
        HashSet<Integer> number = new HashSet<>();
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            count =+ nums[i];
            if(number.contains(count))
                return true;
            if(count == 0)
                return true;
            number.add(count);
        }
        return false;
    }
    public static void main(String[] args) {
        int number[] = {3,4,3,-1,1};
        System.out.println(isSubarrayZero(number));
    }
}
