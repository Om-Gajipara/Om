import java.util.*;
public class prg4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number :");
		int a=sc.nextInt();
		int ans=1;
		for(int i=1;i<=a;i++){
			ans=ans*i;
		}

		System.out.print("Factorial :"+ans);
	}
}