import java.util.ArrayList;

public class Array1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(5);
        arr.add(6);
        arr.add(7);
        int even=0;
        int odd=0;
        arr.remove(5);

        
        for(int var:arr)
        {
            System.out.println(var);
             if(var%2==0)
             {
                even++;
             }
             else
             {
                odd++;
             }
            
        }

        System.out.println("No.of even:"+even);
        System.out.println("No. of odd:"+odd);
        
        
    }
}

    

