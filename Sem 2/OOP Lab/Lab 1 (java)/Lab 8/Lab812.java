import java.util.*;
public class Lab812{
	public static void main(String[] args) {

		System.out.println("Enter Person detail ");
		person p1=new person();
		p1.getdetail();

		System.out.println("Enter Employee detail ");
		employee e1=new employee();
		e1.getEmpDetail();

		System.out.println("Enter Teacher detail ");
		teacher t1=new teacher();
		t1.getTecDetail();

		p1.display();
		e1.display();	
		t1.display();

	}
	public static class person{
		int age,pid;
		String name;
		Scanner sc=new Scanner(System.in);
		void getdetail(){
			System.out.print("Enter Person Id :");
			pid = sc.nextInt();
			System.out.print("Enter Name :");
			name = sc.next();
			System.out.print("Enter Age :");
			age = sc.nextInt();
		}
		void display(){
			System.out.println("******* Person Detail *******");
			System.out.println("Person Id :"+pid);
			System.out.println("Name :"+name);
			System.out.println("Age :"+age);
		}
	}
	public static class employee extends person{
		Scanner sc=new Scanner(System.in);
		int eid,salary;
		String designation;

		void getEmpDetail(){
			super.getdetail();

			System.out.print("Enter Employee Id :");
			eid = sc.nextInt();
			System.out.print("Enter Salary :");
			salary = sc.nextInt();
			System.out.print("Enter Designation :");	
			designation = sc.next();
		}
		void display(){
			System.out.println("******* Emplayee Detail *******");
			System.out.println("Employee Id :"+eid);
			System.out.println("Salary :"+salary);
			System.out.println("Designation :"+designation);
		}
	}
	public static class teacher extends employee{
		Scanner sc=new Scanner(System.in);
		int exp;
		long contact;
		String education;

		void getTecDetail(){
			super.getEmpDetail();
			System.out.print("Enter teacher experence :");
			exp = sc.nextInt();
			System.out.print("Enter contect :");
			contact = sc.nextLong();
			System.out.print("Enter Education :");
			education = sc.next();
		}
		void display(){
			System.out.println("******* Teacher Detail *******");
			System.out.println("Experence :"+exp);
			System.out.println("Contact :"+contact);
			System.out.println("Education :"+education);
		}
	}
}