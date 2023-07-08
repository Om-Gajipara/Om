import java.util.*;

public class Fabonacci 
	{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number :");
		int a=sc.nextInt();

		fabonacci(a);
	}	

	static void fabonacci(int x)
	{
		int a=1,b=1,c;

		System.out.println("Fabonacci series for "+x+" terms");
		System.out.print(a+"\t");
		System.out.print(b+"\t");
		for(int i=3;i<=x;i++){
			c=a+b;
			System.out.print(c+"\t");
			a=b;
			b=c;
		}
	}
}
