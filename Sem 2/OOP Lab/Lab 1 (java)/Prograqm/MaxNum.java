import java.util.*;

public class MaxNum 
	{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number a:");
		int a=sc.nextInt();
		System.out.print("enter number b:");
		int b=sc.nextInt();

		max(a,b);
	}	

	static void max(int x,int y)
	{
		if(x>y){
			System.out.println("max number is "+x);
		}
		else{
			System.out.println("max number is "+y);
		}

	}
}
