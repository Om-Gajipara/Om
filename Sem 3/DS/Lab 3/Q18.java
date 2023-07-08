import java.util.*;
public class Q18 {
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n= input.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("enter array element");
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the number you want to delete");
        int m=input.nextInt();
        int posi=0;
        for(int i=0 ; i<n; i++ )
        {
            if(arr[i] ==m){
                posi=i;
                break;
            }
        }
        for( int i=posi; i<(n-1); i++){
            arr[i]= arr[i+1];
        }
        for(int i=0 ;i<n-1; i++)
        {
            System.out.println(arr[i]);
        }


    }
}
