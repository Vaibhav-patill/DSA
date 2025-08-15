
import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        //country(key),population(value)
        //create hashmap
        HashMap<String,Integer> map = new HashMap<>();

        //Insertion
        map.put("India", 120);
        map.put("US", 130);
        map.put("China", 120);
        map.put("Japan", 100);
        map.put("Nepal", 5);
    
        //print all keys
        Set<String> keys = map.keySet();
        System.out.println(keys);

        //print all values
        for (String k : keys) {
            System.out.println("key="+k + " " + "value="+ map.get(k));
        }

        System.out.println(map);
        map.put("India", 180);
        System.out.println(map);

        //get
        int population = map.getOrDefault("USA", 0);
        System.out.println(population);

        

        //if value is not present return null
        System.out.println(map.get("Japan"));

        //search
        if(map.containsKey("India")){
            System.out.println("Found");
        }
        else{
            System.out.println("Not Found");
        }

        //remove
        map.remove("China");
        System.out.println(map);

        //size
        System.out.println(map.size());

        //isEmpty
        System.out.println(map.isEmpty());

        //clear
        // map.clear();
        // System.out.println(map);    

        int arr[]={12,13,14};
        for(int val:arr){
            System.out.print(val + " "  );
        }System.err.println();

        //iteration
        for(Map.Entry<String,Integer> e:map.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
