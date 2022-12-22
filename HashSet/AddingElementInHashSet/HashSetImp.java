package HashSet.AddingElementInHashSet;
import java.util.HashSet;;

public class HashSetImp {
    public static int work(int number[]){
        HashSet<Integer> num = new HashSet<>();
        for(int i = 0; i < number.length-1; i++){
            num.add(number[i]);
        }
        return num.size();
    }
    public static void main(String[] args) {
        int number[] = {8,3,1,4,4,0,2};
        System.out.println(work(number));
    }
}
