import java.util.Scanner;
class Candidate {
	public static void main(String[] args) {
		CandidateInfo c1 =new CandidateInfo();
		c1.getDetail();
		c1.showDetail();
	}
}

class CandidateInfo {
	int Id;
	String Name;
	int Age;
	float Weight;
	float Height;

	void getDetail(){
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter Candidate Id :");
		Id =sc.nextInt();
		System.out.print("Enter Candidate Name :");
		Name =sc.next();
		System.out.print("Enter Candidate Age :");
		Age =sc.nextInt();
		System.out.print("Enter Candidate Weight :");
		Weight =sc.nextFloat();
		System.out.print("Enter Candidate Height :");
		Height =sc.nextFloat();
	}

	void showDetail(){
		System.out.println("------Candidate Detail------");
		System.out.println("Candidate Id :"+Id);
		System.out.println("Candidate Name :"+Name);
		System.out.println("Candidate Age :"+Age);
		System.out.println("Candidate Weight :"+Weight);
		System.out.println("Candidate Height :"+Height);
	}
}