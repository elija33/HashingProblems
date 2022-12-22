package DirectAddressTable;

public class DirectAdd {
    int number[] = new int [1000];

    public void insert(int i){
        number[i] = 1;
    }

    public int Search(int i){
        return number[i];
    }

    public int Delet(int i){
       return number[i] = 0;
    }
    public static void main(String[] args) {
        DirectAdd direct = new DirectAdd();
        direct.insert(10);
        direct.insert(12);
        direct.insert(2);
        System.out.println(direct.Search(10));
        System.out.println(direct.Search(4));
        direct.Delet(12);
        System.out.println(direct.Search(2));
    }
}