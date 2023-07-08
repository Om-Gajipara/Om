import java.util.*;

public class SimpleIntrest 
	{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter principal:");
		float p=sc.nextFloat();
		System.out.print("enter time:");
		float t=sc.nextFloat();
		System.out.print("enter rate:");
		float r=sc.nextFloat();

		si(p,r,t);
	}	

	static void si(float a,float b, float c)
	{
		double ans=0;
		ans=(a*b*c)/100;
		System.out.println("SI="+ans);
	}
}
