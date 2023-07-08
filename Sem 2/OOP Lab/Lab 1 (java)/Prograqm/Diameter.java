import java.util.*;
public class Diameter {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("enter area:");
		double a=scan.nextDouble();
		double d,r;
		r=Math.sqrt(a/3.14);
		d=2*r;

		System.out.println("value of diameter :"+d);
	}
}