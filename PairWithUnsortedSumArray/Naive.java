package PairWithUnsortedSumArray;

public class Naive {
    public static boolean number(int num[], int target){
        for(int i = 0; i < num.length; i++)
            for(int j = i + 1; j < num.length; j++)
                if(num[i] + num[j] == target)
                    return true;
        
        return false;
    }
    public static void main(String[] args) {
        int numerb[] ={3,2,8,18,-8};
        System.out.println(number(numerb, 1));   
    }
}
