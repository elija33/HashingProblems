package IntersectionTwoArrays;

public class NavieIntersectionArrays {
    public static int Intersection(int number[], int number1[]){
        int count = 0;
        for(int i = 0; i < number.length; i++){
            boolean flag = false;
            for(int j = 0; j < i - 1; j++)
                if(number[i] == number[j]){
                    flag = true;
                    break;
                }
            if(flag == true){
                continue;
            }
            for(int k = 0; k < number1.length; k++){
                if(number[i] == number1[k]){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int number1[] = {10,15,20,15,30,5};
        int number[] = {30,5,30,80};
        System.out.println(Intersection(number, number1));
    }
}
