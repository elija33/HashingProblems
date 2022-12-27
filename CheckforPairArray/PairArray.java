package CheckforPairArray;

import java.util.HashSet;

public class PairArray {
    public static void Array(int arr[], int target){
        HashSet<Integer> num = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            if(num.contains(target - arr[i])){
                System.out.println("Yes");
                return;
            }   
                num.add(arr[i]);
        }
        System.out.println("No");
    }
    public static void main(String[] args) {
        int number[] = {1, 4, 45, 6, 10, 8};
        int target = 16;
        Array(number, target);
    }
}
