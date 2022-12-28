package TwoArrayDisjointCheck;

import java.util.HashSet;

public class DisjointCheck {
    public static boolean disjoint(int arr[], int arr1[]){
        HashSet<Integer> num = new HashSet<>();
        for(int i = 0; i < arr.length; i++)
            num.add(arr[i]);

        for(int i = 0; i < arr1.length; i++)
            if(!num.contains(arr1[i]))
                return false;

        return true;
    }
    public static void main(String[] args) {
        int number[] = {12, 34, 11, 9, 0};
        int number1[] = {2, 1, 3, 5};
        System.out.println(disjoint(number, number1));
    }
}
