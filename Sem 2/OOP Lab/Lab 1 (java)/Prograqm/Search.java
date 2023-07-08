import java.util.*;
public class Search{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0,a=0;
		System.out.print("Enter array size : ");
		int n=sc.nextInt();
		int arr[]= new int[n];
		int pos[]= new int[n];
		for(int i=0;i<n;i++){
			System.out.print("Enter "+(i+1)+" value : ");
			arr[i] = sc.nextInt();
		}

		System.out.print("Enter vale to search : ");
		int s=sc.nextInt();
		for(int i=0;i<n;i++){	
			if(arr[i]==s){
				count++;
				System.out,println("element found at "+(i+1));
			}
		}

		if(count==0){
				System.out.println("number is not present");
		}
		else{
				System.out.println("number is present "+count+" times");
		}
	}
}