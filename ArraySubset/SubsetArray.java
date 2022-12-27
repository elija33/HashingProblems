package ArraySubset;

import java.util.HashSet;

public class SubsetArray {
    public static boolean ArrayNumber(int arr[], int arr1[]){
        HashSet<Integer> num = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
          if(!num.contains(arr[i]))
            num.add(arr[i]);
        }
        for(int i = 0; i < arr1.length; i++){
            if(!num.contains(arr1[i]))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int number[] = {11, 1, 13, 21, 3, 7};
        int number1[] = {11, 3, 7, 1};
        System.out.println(ArrayNumber(number, number1));
    }
}
