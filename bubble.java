public class bubble {

    public static void Bubble(int arr[])
    {

        
        for(int i =1;i < arr.length;i++)
        {
           
             int temp = 0;
             boolean swap = false;
            for(int j = 0;j < arr.length-i;j++)
            {

                if(arr[j] > arr[j+1])
                {
                   
                   temp = arr[j];
                   arr[j] = arr[j+1]; 
                   arr[j+1] = temp;
                   swap = true;

                }
            }

            if(swap == false)
            {
                break;
            }
        }
    }

    public static void main(String args[])
    {

        int arr[] = {3,9,1,4,8,2};

          Bubble(arr);

          for(int i =0;i < arr.length;i++)
          {

            System.out.print(arr[i]+" ");

          }
    }
}
