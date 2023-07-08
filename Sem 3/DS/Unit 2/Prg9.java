import java.util.*;
public class Prg9{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter size of array :");
		int n=sc.nextInt();
		int arr[]=new int [n];

		for(int i=0;i<arr.length;i++){
			System.out.println("Enter the Number: ");		
			arr[i]=sc.nextInt();
		}

		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+", ");	
		}
	}
}