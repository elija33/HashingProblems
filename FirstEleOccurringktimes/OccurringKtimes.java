package FirstEleOccurringktimes;

import java.util.HashMap;

public class OccurringKtimes {
    public static int Ktime(int arr[], int target){
        HashMap<Integer, Integer> num = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            int count = 0;
            if(num.get(arr[i]) != null){
                count = num.get(arr[i]);
            }
            num.put(arr[i], count + 1);
        }
        for(int i = 0; i < arr.length; i++){
            if(num.get(arr[i]) == target){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = {1, 7, 4, 3, 4, 8, 7};
        int target = 2;
        System.out.println(Ktime(number, target));
    }
}
