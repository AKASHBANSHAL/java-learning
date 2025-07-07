import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter the size of array");
        int n= in .nextInt();
        System.out.println("enter the elements");
        int[] arr= new int[n];
        for(int i=0;i<n;i++)
        {
           arr[i]=in.nextInt();
3
        }
        int max=arr[0];

        for(int k=0;k<arr.length;k++)
        {
            if(arr[k]>max);

        }
        System.out.println(max);






    }
}
