import java.util.*;
public class Prg12{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter size of array :");
		int n=sc.nextInt();
		int arr[]=new int [n];

		for(int i=0;i<arr.length;i++){
			System.out.println("Enter the Number: ");		
			arr[i]=sc.nextInt();
		}
		float min=arr[0];
		for(int i=1;i<arr.length;i++){
			if(min>arr[i]){
				min=arr[i];
			}
		}
		System.out.println("minimum number is ="+min);
	}
}