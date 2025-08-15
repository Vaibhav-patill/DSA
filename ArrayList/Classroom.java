
import java.util.ArrayList;


public class Classroom {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        System.out.println(list1);

        //get operations
        System.out.println("Element at index 2: " + list1.get(2));

        //set element at index 
        list1.set(2, 10);
        System.out.println("After setting index 2 to 10: " + list1);

        //contain operation
        System.out.println("Does list1 contain 10? " + list1.contains(10));

        //size operation
        System.out.println("Size of list1: " + list1.size());

        //print in reverse order
        for(int i=list1.size()-1;i>=0;i--){
            System.err.print(list1.get(i)+" ");
        }System.err.println();
    }
}
