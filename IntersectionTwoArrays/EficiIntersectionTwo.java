package IntersectionTwoArrays;

import java.util.HashSet;

public class EficiIntersectionTwo {
    public static int IntersectionTwo(int number[], int number1[]){
        HashSet<Integer> nums = new HashSet<>();
        for(int i = 0; i < number.length; i++){
            nums.add(number[i]);
        }
        int count = 0;
        for(int j = 0; j<number1.length; j++){
            if(nums.contains(number1[j])){
                count++;
                nums.remove(number1[j]);
            }
        }
       return count;
    }
    public static void main(String[] args) {
        int number[] = {10,15,20,15,30,30,5};
        int number1[] = {30,5,30,80,30, 15};
        System.out.println(IntersectionTwo(number, number1));
    }
}
