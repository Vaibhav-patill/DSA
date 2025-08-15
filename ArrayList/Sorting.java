
import java.util.ArrayList;
import java.util.Collections;


public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(3);
        list.add(8);
        
        // Bubble Sort
        // for (int i = 0; i < list.size() - 1; i++) {
        //     for (int j = 0; j < list.size() - 1 - i; j++) {
        //         if (list.get(j) > list.get(j + 1)) {
        //             // Swap elements
        //             int temp = list.get(j);
        //             list.set(j, list.get(j + 1));
        //             list.set(j + 1, temp);
        //         }
        //     }
        // }

        System.out.println("Initial List: " + list);

        //ascending order
        Collections.sort(list); // Using Collections.sort for simplicity
        System.out.println("Sorted List: " + list);
        //descending order
        Collections.sort(list, Collections.reverseOrder());//comparative
    }
}
