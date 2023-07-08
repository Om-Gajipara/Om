import java.util.*;
public class Prg16{
	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
        System.out.println("Enter the elements of the array : ");
            arr[i] = sc.nextInt();
        }
    	
        System.out.println("Enter the position of elements to be deleted : ");
        int pos = sc.nextInt();
        pos=pos-1;

        for(int i=pos;i<n-1;i++) {
            arr[i] = arr[i+1];
        }
        
            System.out.println("\nThe new array is : ");
        
            for(int i=0;i<n-1;i++) {
                System.out.print(arr[i]+", ");
        }
    }
}