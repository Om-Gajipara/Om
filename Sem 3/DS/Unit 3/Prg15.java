import java.util.*;
public class Prg15{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter size of array :");
		int n=sc.nextInt();
		int arr[]=new int [n+1];

		for(int i=0;i<n;i++){
			System.out.println("Enter the Number: ");		
			arr[i]=sc.nextInt();
		}

		System.out.println("Enter the Number to add: ");		
			int num=sc.nextInt();

		System.out.println("Enter the position for number: ");		
			int pos=sc.nextInt();

		for(int i=n-1;i>=(pos-1);i--){
			arr[i+1]=arr[i];
		}
		arr[pos-1]=num;

		for(int i=0;i<n+1;i++){
			System.out.print(arr[i]+", ");
		}
	}
}