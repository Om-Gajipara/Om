import java.util.*;

public class ThisDemo{
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);

			System.out.print("Enter height ");
			double height =sc.nextDouble();
			System.out.print("Enter length ");
			double length =sc.nextDouble();
			System.out.print("Enter width ");
			double width =sc.nextDouble();


			box b1=new box(height,length,width);
			b1.display();
			b1.volume();
	}
}

class box{
	double height,  length,  width;
	box(double height, double length, double width){
	this.height=height;
	this.length=length;
	this.width=width ;
}
	void display(){
	System.out.println("height "+height+"  length "+length+"  width "+width);
	}

	void volume(){
		Double volume=height*length*width;

		System.out.println("Volume ="+volume);
	}
}