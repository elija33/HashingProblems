package LongestCommonSpanSame;

import java.util.HashMap;

public class SpanSame {
    public static int longestSpan(int arr[], int arr2[], int n){
        int count = 0;
        int temp[] = new int[n];
        for(int i = 0; i < n; i++)
            temp[i] = arr[i] - arr[i];
            HashMap<Integer, Integer> number = new HashMap<>();
            int sum = 0;
            int sumNumber = 0;
            for(int i = 0; i < n; i++){
                sum += temp[i];
                if(sum == 0)
                    sumNumber = i + 1;

                if(number.containsKey(sum))
                    sumNumber = Math.max(sumNumber, i - number.get(sum));
                
                else 
                    number.put(sum, i);
            }
        return sumNumber;
    }
    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 1, 1, 1, 1};
        int arr1[] = {1, 1, 1, 1, 1, 0, 1};
        int n = arr.length;
        System.out.println(longestSpan(arr, arr1, n));  
    }
}
