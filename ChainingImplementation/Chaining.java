package ChainingImplementation;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Chaining {
    int butket;
    ArrayList<LinkedList<Integer>> table;
    
     Chaining(int num){
        butket = num;
        table = new ArrayList<>();
        for(int i = 0; i < num; i++)
            table.add(new LinkedList<>());
    }

    public void insert(Integer key){
       int i = key % butket;
       table.get(i).add(key);
    }

    public boolean seach(Integer key){
        int i = key % butket;
        return table.get(i).contains(key);
    }

    public void remove(Integer key){
        int i = key % butket;
        table.get(i).remove(key);
    }
    public static void main(String[] args) {
        
    }
}
