
import java.util.LinkedList;

public class LLFrameWork {
    public static void main(String[] args) {
        // creating a linked list
        LinkedList<Integer> ll=new LinkedList<>();

        //add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);

        System.err.println(ll);

        //remove
        ll.removeFirst();
        ll.removeLast();

        System.err.println(ll);
    }
}
