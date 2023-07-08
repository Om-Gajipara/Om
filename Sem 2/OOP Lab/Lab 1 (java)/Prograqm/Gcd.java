import java.util.*;

public class Gcd{
	public static void main(String[] args) {
		int ans;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number 1 :");
			int a=sc.nextInt();
		System.out.print("Enter number 2 :");
			int b=sc.nextInt();
		ans=Gcd(a,b);

		System.out.println("GCD is :"+ans);
	}
		static int Gcd(int a,int b){
			int ans=1;	
			int n;
			if(a<b){
				n=b;
			}
			else{
				n=a;
			}

			for(int i=1;i<=n;i++){
				if(a%i==0){
					if(b%i==0){
						ans=i;
					}
				}
			}
		return ans;
		}
}	