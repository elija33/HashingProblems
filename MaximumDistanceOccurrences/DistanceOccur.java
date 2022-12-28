package MaximumDistanceOccurrences;

import java.util.HashMap;

public class DistanceOccur {
    public static int Occur(int arr[]){
        HashMap<Integer, Integer> num = new HashMap<>();
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(!num.containsKey(arr[i]))
            num.put(arr[i], i);

            else
                sum = Math.max(sum, i - num.get(arr[i]));
        }
        return sum;
    }
    public static void main(String[] args) {
        int number[] = {1, 3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2, 1};
        System.out.println(Occur(number));
    }
}
