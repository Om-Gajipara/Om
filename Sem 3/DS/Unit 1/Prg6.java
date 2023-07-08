import java.util.*;
public class Prg6{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number x (x^y) :");
		int x=sc.nextInt();
		System.out.print("Enter number y (x^y) :");
		int y=sc.nextInt();
		int ans=1;
		for(int i=1;i<=y;i++){
			ans=ans*x;
		}

		System.out.print("power :"+ans);
	}
}