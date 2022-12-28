package CheckEqualArrays;

public class EqualArray {
    public static boolean CheckingArray(int arr[], int arr1[]){
        for(int i = 0; i < arr.length; i++)
        for(int j = 0; j < arr1.length; j++)
                if(arr[i] == arr1[j])
                    return true;
                
        
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,5,0};
        int arr1[] = {2,4,5,0,1};
        System.out.println(CheckingArray(arr, arr1));
    }
}
