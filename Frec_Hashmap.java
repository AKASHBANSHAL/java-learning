import java.util.HashMap;

public class Frec_Hashmap {
    public static void main(String[] args) {
        
    
    String input ="Hello";
    HashMap<Character,Integer> map=new HashMap<>();
    for(char ch:input.toCharArray())
    {
        if(ch!=' ');
        {
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        

    }
    System.out.println(map);
    
  }

}
    

