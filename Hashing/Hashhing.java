
import java.util.HashSet;
import java.util.Iterator;


public class Hashhing {
    public static void main(String[] args) {
       HashSet<Integer> set =new HashSet<>();

       //Insert
        set.add(1);
        set.add(2); 
        set.add(3);

        //Search

        if(set.contains(2)){
            System.out.println("Found");
        }
        if(!set.contains(4)){
            System.out.println("Not Found");
    }

    Iterator it=set.iterator();
    
}
}
