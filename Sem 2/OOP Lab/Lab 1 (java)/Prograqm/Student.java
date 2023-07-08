import java.util.Scanner;
class Student {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);


		int enrollment,name,gender,mark;
		StudentInfo s1=new StudentInfo();	
		StudentInfo s2=new StudentInfo(123,"Magan","Male",156);	

		System.out.print("Enter Student Enrolment no. :");
		enrollment =sc.nextLong();
		System.out.print("Enter Student Name :");
		name =sc.next();
		System.out.print("Enter Student Gender :");
		gender =sc.next();
		System.out.print("Enter Student Marks :");
		mark =sc.nextInt();

		StudentInfo s3=new StudentInfo(enrollment,name,gender,mark);

		s1.display();
		s2.display();
		s3.display();
		}
}

class StudentInfo {
	Long Enrollment;
	String Name;
	String Gender;
	int Mark;

	Student(){
	 Enrollment=123;
	 Name="Chagan";
	 Gender="male";
	 Mark=123;
	}

	Student(long er,String n,String g,Int m){
	 Enrollment=er;
	 Name=n;
	 Gender=g;
	 Mark=m;
	}

	void display(){
		System.out.println("------Student Detail------");
		System.out.println("Student Enrolment no.  :"+Enrollment);
		System.out.println("Student Name :"+Name);
		System.out.println("Student Gender :"+Gender);
		System.out.println("Student Mark :"+Mark);
	}
}