import java.util.*;
public class prg5{
	public static void main(String[] args) {
		prg5 object = new prg5();

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number :");
		int n=sc.nextInt();
		System.out.print("Factorial :"+object.fact(n));
	}
	public int fact(int n){
		if (n==1) return 1;
		return n*(n-1);
	}
}