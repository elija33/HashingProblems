package PairWithUnsortedSumArray;

import java.util.HashSet;

public class EfficiPairWithUnsor {
    public static int PairWithEle(int number[],  int target){
        HashSet<Integer> nums = new HashSet<>();
        for(int i = 0; i < number.length; i++){
            if(nums.contains(target - number[i]))
                return 1;
                nums.add(number[i]);
        }
        return 0;
    }
    public static void main(String[] args) {
        int target = 5;
        int number[] = new int[] {3, 8, 4, 7, 6, 1};
        System.out.println(PairWithEle(number, target));
    }
}
