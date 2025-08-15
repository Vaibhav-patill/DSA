import java.util.HashMap;
import java.util.TreeMap;

public class TreeHash {
    public static void main(String[] args) {

        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);

        System.out.println(hm);

        //sorting is based on key
        TreeMap<String,Integer> tm=new TreeMap<>();
        tm.put("India",100);
        tm.put("China",150);
        tm.put("US",50);

        System.out.println(tm);
    }
}
