import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the no. of rows");
        int rows=in.nextInt();
        System.out.println("enter the no. of colomns");
        int colomns=in.nextInt();

        int[][] matrix=new int[rows][colomns];

        for(int i=0;i<rows;i++){
             for(int j=0;j<colomns;j++)
             {
                matrix[i][j]=in.nextInt();
                
              }
           
            }
            int[][] transpose=new int[colomns][rows];
            for(int i=0;i<colomns;i++)
            {
             for(int j=0;j<rows;j++)
             {
               transpose[i][j]= matrix[j][i];
             }
        }
        System.out.println("transpose matrix");
        int max=0;
        for(int i=0;i<colomns;i++)
            {
             for(int j=0;j<rows;j++)
             {
               System.out.print(transpose[i][j]+"  ");
               if(transpose[i][j]>max)
               {
                max=transpose[i][j];
                
               }
            }
            System.out.println(" ");

        }
        System.out.println("maximum element:"+max);
       


    }
    
}
