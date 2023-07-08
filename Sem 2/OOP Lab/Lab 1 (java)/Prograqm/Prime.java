import java.util.*;

public class Prime 
	{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number :");
		int n=sc.nextInt();
		int ans;
		ans=prime(n);
																			
		if(ans==0){
			System.out.print("number is prime");
		}
		else{
			System.out.print("number is not prime");
		}
	}	

	static int prime(int n)
	{
		int count=1;
		for(int i=1;i<=n/2;i++){
			if(n%i==0){
				count++;
				break;
			}
		}

		return 1;
		
	}	
}
