import java.util.*;
public class Calc {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("enter value a:");
		double a=scan.nextDouble();
		System.out.print("enter value b:");
		double b=scan.nextDouble();
		System.out.print("enter operater:\n'1'for add\n'2'for sub\n'3'for multy\n'4'for div\n");
		int c=scan.nextInt();
		
		switch(c){
			case 1: System.out.println("Answer is :"+(a+b));
				break;
			case 2: System.out.println("Answer is :"+(a-b));
				break;
			case 3: System.out.println("Answer is :"+(a*b));
				break;
			case 4: System.out.println("Answer is :"+(a/b));
				break;
			default:     
  					System.out.println("invalid operator ");  
		}

	}
}