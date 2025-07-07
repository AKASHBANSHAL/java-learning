

public class Basic {
public static void main(String[] args) {
    int[] arr1={1,2,3,4,5};
    int [] arr2={4,2,4,2,4};
    int sum=0;
    for(int i=0;i<arr1.length;i++)
    {
        sum=sum+arr1[i]+arr2[i];

    }
    System.out.println("sum:"+sum);
}
    
}