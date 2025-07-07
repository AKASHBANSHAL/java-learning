import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class Set1 {
    public static void main(String[] args) {
        // HashSet<String> set=new HashSet<>();
        // set.add("akash");
        // set.add("bansal");
        // set.add("rama");
        // //System.out.println(set);
        // set.remove("rama");
        
        // System.out.println(set.contains("bansal"));//booelen type answer
        // System.out.println(set);

        // TreeSet<Integer> data=new TreeSet<>();
        // data.add(45);
        // data.add(6);
        // data.add(15);
        // data.add(55);
        // System.out.println(data);






        HashMap<String,Integer> map=new HashMap<>();
        map.put("one",1);
        map.put("two",2);
    //     map.remove("two");
    //    System.out.println(map.containsValue(1));

         
    //     System.out.println(map);
    //     System.out.println(map.get("two"));
    System.out.println(map.getOrDefault("three", null));

    }
    
}
