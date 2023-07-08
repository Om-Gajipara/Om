import java.util.*;
public class Lab813{
	public static void main(String[] args) {

		circle c1=new circle(4);
		c1.display();

		rectangle r1=new rectangle(4,6);
		r1.display();
		
		triangle t1=new triangle(4,6,8);
		t1.display();
	}
	
	public static class shape{
		float a;

		shape(float x){
			a=x;
		}
		void display(){
			System.out.println("Length is :"+a);
		}
	}

	public static class circle extends shape{

		circle(float x){
			super(x);
		}
		void display(){
			super.display();
			System.out.println("area of circle is :"+area());
		}
		double area(){
			double  ans;

			ans=3.14*a*a;
			return ans;
		}
	}
	public static class rectangle extends shape{
		float w;
		rectangle(float a,float b){
			super(a);
			w=b;
		}
		void display(){
			super.display();
			System.out.println("width of rectangle is :"+w);
			System.out.println("area of rectangle is :"+area());
		}
		double area(){
			double  ans;

			ans=a*w;
			return ans;
		}
	}
	public static class triangle extends shape{
		float h,w;
		triangle(float a,float b,float c){
			super(a);
			w=b;
			h=c;
		}
		void display(){
			super.display();
			System.out.println("height of triangle is :"+h);
			System.out.println("area of rectangle is :"+area());
		}
		double area(){
			double  ans,s;

			s=(a+w+h)/2;
			ans=Math.sqrt(s*(s-a)*(s-w)*(s-h));
			return ans;
		}
	}

}