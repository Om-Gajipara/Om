import java.util.*;
public class Prg8{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number :");
		int a=sc.nextInt();
		int count=0;
		for(int i=2;i<a;i++){
			if(a%i==0){
				count++;
			}
		}
		if(count>=1){
			System.out.println("no. is not prime");
		}else{
			System.out.println("no. is prime");
		}
	}
}