package LongestConsecutiveSubsequence;

import java.util.HashSet;

public class LongestConsecutive {
    public static int Consecutive(int arr[]){
        HashSet<Integer> num = new HashSet<>();
        int count = 0;

        for(int i = 0; i < arr.length; i++)
            num.add(arr[i]);

        for(int i = 0; i < arr.length; i++){
            if(!num.contains(arr[i] - 1)){
                int curr = 1;
                while(num.contains(curr + arr[i]))
                    curr++;

                count = Math.max(count, curr);
            }
        }
        
        return count;

    }
    public static void main(String[] args) {
        int number[] = {0,1,2,3,4,8,9,55};
        System.out.println(Consecutive(number));
    }
}
