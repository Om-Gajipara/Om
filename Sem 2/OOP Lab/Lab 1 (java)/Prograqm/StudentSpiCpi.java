

import java.util.*;

public class StudentSpiCpi
{
	public static void main(String[] args)
	{
		Student one = new Student();
		one.GetStudentDetails();

		one.DisplayStudentDetails(); 
	}
}

class Student
{
	long Enrollment_No;
	String Student_Name;
	int Semester;
	Double CPI;
	Double SPI;

	void GetStudentDetails()
	{
		Scanner sc= new Scanner(System.in);

		System.out.print("Enter Enrollment No: ");
		Enrollment_No=sc.nextLong();
		System.out.print("Enter Student Name : ");
		Student_Name=sc.next();
		System.out.print("Enter Semester : ");
		Semester=sc.nextInt();
		System.out.print("Enter CPI : ");
		CPI=sc.nextDouble();
		System.out.print("Enter SPI : ");
		SPI=sc.nextDouble();
	}

	void DisplayStudentDetails()
	{
		System.out.println(Enrollment_No);
		System.out.println(Student_Name);
		System.out.println(Semester);
		System.out.println(CPI);
		System.out.println(SPI);
		
	}

}
