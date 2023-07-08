import java.util.*;

public class StaticDemo{
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
			box b1=new box();
			b1.display();
			b1.volume();

			System.out.print("Enter height ");
			double height =sc.nextDouble();
			System.out.print("Enter length ");
			double length =sc.nextDouble();
			System.out.print("Enter width ");
			double width =sc.nextDouble();


			box b2=new box(height,length,width);
			b2.display();
			b2.volume();

			box b3=new box(b1);

			System.out.println("Total Object :"+box.cnt);
	}
}

class box{
	double height,  length,  width;
	static int cnt=0;

	box(){
	height=0;
	length=0;
	width=0 ;
	cnt++;
	}

	box(box b){
	this.height=b.height;
	this.length=b.length;
	this.width=b.width ;
	cnt++;
	}

	box(double height, double length, double width){
	this.height=height;
	this.length=length;
	this.width=width ;
	cnt++;
	}

	void display(){
	System.out.println("height "+height+"  length "+length+"  width "+width);
	}

	void volume(){
		Double volume=height*length*width;

		System.out.println("Volume ="+volume);
	}
}