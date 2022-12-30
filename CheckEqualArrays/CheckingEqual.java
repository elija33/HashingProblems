package CheckEqualArrays;

import java.util.HashSet;

public class CheckingEqual {
    public static boolean equal(int arr[], int arr1[]){
        HashSet<Integer> num = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            num.add(arr[i]);
        }
        for(int i = 0; i < arr1.length; i++){
            if(num.contains(arr1[i])){
                num.add(arr1[i]);
                return true;
                
            }
        }
        return false;
    }
    public static void main(String[] args) {
        
    }
}
