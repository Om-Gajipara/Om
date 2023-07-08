import java.util.*;
public class CountOddEven{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int odd=0 , even=0;
		System.out.println("Enter value of (n) ");
		int n=sc.nextInt();
		int arr[]= new int[n];

		for(int i=0;i<n;i++){
			arr[i]=i+1;
		}

		for(int i=0;i<n;i++){	
			if(arr[i]%2==0){
				even++;
			}else{
				odd++;
			}
		}

		System.out.println("Total even count : "+even);
		System.out.println("Total odd count : "+odd);

	}
}