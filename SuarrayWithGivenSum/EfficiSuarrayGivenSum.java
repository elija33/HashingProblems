package SuarrayWithGivenSum;

import java.util.HashSet;

public class EfficiSuarrayGivenSum {
    public static boolean SuarrayGiveSum(int number[], int target){
        HashSet<Integer> num = new HashSet<>();
        int count = 0;
        for(int i = 0; i < number.length-1; i++){
            count += number[i];
            if(num.contains(count))
                return true;
            if(count == target)
                return true;
            num.add(count);
        }
        return false;
    }
    public static void main(String[] args) {
        int number[] = {3,4,3,1,-1};
        int target = 10;
        System.out.println(SuarrayGiveSum(number, target));
    }
}
