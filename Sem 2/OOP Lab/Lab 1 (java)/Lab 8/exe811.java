import java.util.*;
public class exe811 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
			
			System.out.println("*****Enter details of Room*****");
			System.out.print("Enter height ");
			float h =sc.nextFloat();
			System.out.print("Enter length ");
			float l =sc.nextFloat();
			System.out.print("Enter width ");
			float w =sc.nextFloat();
			System.out.print("Enter windows ");
			byte n =sc.nextByte();

		Room r1=new Room(l,w,h,n);


			System.out.println("*****Enter details of Classroom*****");
			System.out.print("Enter height ");
			 h =sc.nextFloat();
			System.out.print("Enter length ");
			 l =sc.nextFloat();
			System.out.print("Enter width ");
			 w =sc.nextFloat();
			System.out.print("Enter windows ");
			 n =sc.nextByte();
			System.out.print("Enter benches ");
			int b =sc.nextInt();
			System.out.print("Enter no. seats ");
			int ns =sc.nextInt();
			System.out.print("Enter lights ");
			byte lt =sc.nextByte();
			System.out.print("Enter fan ");
			byte f =sc.nextByte();


		Classroom c1=new Classroom(l,w,h,n,b,ns,lt,f);

		System.out.println("\n*****Details of Room fan*****");
			r1.display();

		System.out.println("\n*****Details of Classroom fan*****");
			c1.display();

	}
}

class Room {
	float length, width ,height;
	byte window;

	Room(float l, float w, float h, byte n){
		length=l;
		width=w;
		height=h;
		window=n;
	}

	double area(){
		return length*width;
	}
	void display(){
		System.out.println("length is :"+length);
		System.out.println("width is :"+width);
		System.out.println("height is :"+height);
		System.out.println("window are :"+window);
		System.out.println("Area of room is :"+area());
	}
}

class Classroom extends Room{
	int benches, nseats;
	byte light,fan;

	Classroom(float l, float w, float h, byte n, int b, int ns, byte lt, byte f){
		super(l,w,h,n);
		benches=b;
		nseats=ns;
		light=lt;
		fan=f;
	}
	int getseats(){
		return benches*nseats;
	}
	void display(){
		super.display();
		System.out.println("benches is :"+benches);
		System.out.println("light is :"+light);
		System.out.println("fan are :"+fan);
		System.out.println("seats are :"+nseats);
		System.out.println("Total seats are :"+getseats());
	}
}