import java.util.*;
public class Prg18 {
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
        int num=input.nextInt();
        int pos=0;
        for(int i=0 ; i<n; i++ )
        {
            if(arr[i] ==num){
                pos=i;
                break;
            }
        }
        for( int i=pos; i<(n-1); i++){
            arr[i]= arr[i+1];
        }
        for(int i=0 ;i<n-1; i++)
        {
            System.out.println(arr[i]);
        }


    }
}