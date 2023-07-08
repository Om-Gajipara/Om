import java.util.*;
public class SumOfN{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		System.out.print("Enter array size : ");
		int n=sc.nextInt();
		int arr[]= new int[n];

		for(int i=0;i<n;i++){
			System.out.print("Enter "+(i+1)+" value");
			arr[i] = sc.nextInt();
		}

		for(int i=0;i<n;i++){	
			if(arr[i]%3==0 || arr[i]%5==0){
				sum=sum+arr[i];
			}
		}

		System.out.println("Total sum : "+sum);

	}
}