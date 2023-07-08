import java.util.*;
public class Bmi {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("enter weight:");
		double w=scan.nextDouble();
		System.out.print("enter height:");
		double h=scan.nextDouble();
		double bmi,nw,nh;
		nw=w*0.45359237;
		nh=h*0.0254;
		bmi=nw/(nh*nh);

		System.out.println("BMI is :"+bmi);
	}
}