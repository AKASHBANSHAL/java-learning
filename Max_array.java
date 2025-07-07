public class Max_array {
    public static void main(String[] args) {
        int[] arr1={1,2,4,5,7,78,4,5};
        int[] arr2={21,4,5,7,2,7,7,84,96};
        int max1=0,max2=0;
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]>max1)
            {
                max1=arr1[i];

            }
        }
            for(int j=0;j<arr2.length;j++)
        {
            if(arr2[j]>max2)
            {
                max2=arr2[j];

            }

        }
        
    
    if(max1>max2)
        {
            System.out.println(max1);
        }
        else
        {
             System.out.println(max2);
        }
    
      }
   }
