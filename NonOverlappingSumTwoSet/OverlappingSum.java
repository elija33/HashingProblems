package NonOverlappingSumTwoSet;

import java.util.HashSet;

public class OverlappingSum {
    public static int Overlapping(int arr[], int arr1[]){
        int count = 0; 
        HashSet<Integer> num = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            num.add(arr[i]);
            count += arr[i];
        }

        for(int i = 0; i < arr1.length; i++){
            if(!num.contains(arr1[i])){
                count += arr1[i];
            }
            else{
                count -= arr1[i];
            } 
        }
          return count;  
    }
    public static void main(String[] args) {
        int[] arr = { 5, 4, 9, 2, 3 };    // [5,4,8,9,7,6,] = 
        int[] arr1 = { 2, 8, 7, 6, 3 };
        System.out.println(Overlapping(arr, arr1));
    }
}
