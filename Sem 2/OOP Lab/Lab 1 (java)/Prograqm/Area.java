import java.util.*;

public class Area{
	public static void main(String[] args) {

		area();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter side length of square :");
			float x=sc.nextFloat();
		area(x);

		System.out.print("Enter side1 length of triangle :");
			float p=sc.nextFloat();
		System.out.print("Enter side2 length of triangle :");
			float q=sc.nextFloat();
		System.out.print("Enter side3 length of triangle :");
			float r=sc.nextFloat();
		area(p,q,r);
	}
		static void area(){
			Scanner sc=new Scanner(System.in);

			System.out.print("Enter Radius of circle :");
			float r=sc.nextFloat();
			float ans=3.14f*r*r;
			System.out.println("Area of circle is :"+ans);
	}
		static void area(float a){

			float ans=a*a;
			System.out.println("Area of square is :"+ans);

	}
		static void area(float a,float b,float c){
			float s = (a + b + c)/2;
			double ans=Math.sqrt(s*(s-a)*(s-b)*(s-c));
			System.out.println("Area of triangle is :"+ans);
	}
}