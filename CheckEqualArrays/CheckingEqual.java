package CheckEqualArrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CheckingEqual {
    public static boolean equal(int arr[], int arr1[]){
       Map<Integer, Integer> freqMap1 = new HashMap<>();
       for(int key : arr){
        int freq = freqMap1.getOrDefault(key, 0);
        freq++;
        freqMap1.put(key, freq);
       } 

       HashMap<Integer, Integer> freqMap2 = new HashMap<>();
       for(int keys : arr1){
        int freq = freqMap2.getOrDefault(keys, 0);
        freq++;
        freqMap2.put(keys, freq);
       }

       for(int key : freqMap1.keySet()){
        if(freqMap2.keySet().contains(key)){
            if(freqMap1.get(key) == freqMap2.get(key))
                continue;
            else{
                return false;
            }
        }
        else{
            return false;
        }
       }
       /*
        * Create a hashmap to put the array element init to cont to freq of the element
        * {2 : 1}    ==>  {3 : 1}
         {3 : 1}           {5, 1}
         {5 : 1}           {7: 1}
         {4 : 1}            {2 : 1}
         {6 : 1}            {4 : 1}
         {7 : 1}            {6 : 1}

         get the key in the first map and seach for the second map key set
         if their is not key set we return false
         else get the values from map one and map two and compair the values. 
         if they are not equal we return false
        else count checking  
        */

        return true;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,5,1,4,6,7}; 
        int arr1[] = {3,5,7,2,4,6,};
        System.out.println(equal(arr, arr1));
    }
}
