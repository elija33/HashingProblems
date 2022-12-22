package CountDistinctElements;

import java.util.HashSet;

public class CountDistinct {
    public static int distinct(int nums[]){
        HashSet<Integer> number = new HashSet<>();
        for(int i = 0; i < nums.length-1; i++){
            number.add(nums[i]);
        }
        return number.size();
    }
    public static void main(String[] args) {
        int number[] = {15, 16, 27, 27, 28, 15};
        System.out.println(distinct(number));
    }
}
