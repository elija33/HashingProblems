package UnionTwoUnsorted;

import java.util.HashSet;

public class NaiveUnionTwoUnsort {
    public static int TwoUnsort(int number[], int numbers[]){
        HashSet<Integer> nums = new HashSet<>();
        for(int i = 0; i < number.length; i++)
            nums.add(number[i]);
    
        for(int j = 0; j < numbers.length; j++)
            nums.add(numbers[j]);
            
        return nums.size();
    }
    public static void main(String[] args) {
        int number[] = {15,20,5,15,1};
        int numbers[] = {15,15,15,20,10};
        System.out.println(TwoUnsort(number, numbers));
    }
}
