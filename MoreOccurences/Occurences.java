package MoreOccurences;

import java.util.HashMap;
import java.util.Map;

public class Occurences {
    public static void MoreOccurences(int arr[], int moreOccurences){
        HashMap<Integer, Integer> num = new HashMap<>();
        for(int number : arr)
            num.put(number, num.getOrDefault(number, 0)+ 1);
        for(Map.Entry<Integer, Integer> e : num.entrySet())
            if(e.getValue() > arr.length/moreOccurences)
                System.out.println(e.getKey()+ " ");
    }
    public static void main(String[] args) {
        int number[] = {10,10,20,30,20,10,10};
        int moreOccurences = 2;
        MoreOccurences(number, moreOccurences);
    }
}
