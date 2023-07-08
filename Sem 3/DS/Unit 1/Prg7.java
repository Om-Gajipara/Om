import java.util.*;
public class Prg7{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number :");
		int a=sc.nextInt();
		for(int i=1;i<=a;i++){
			if(a%i==0){
				System.out.print(i+", ");		
			}
		}
	}
}