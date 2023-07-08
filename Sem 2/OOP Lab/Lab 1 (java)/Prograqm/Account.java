import java.util.Scanner;
class Account {
	public static void main(String[] args) {
		AccountInfo c1 =new AccountInfo();
		c1.getDetail();
		c1.showDetail();
	}
}
class AccountInfo {
	    long Account_No;
	    String User_Name;
	    String Email;
	    String Account_Type;
	    float Account_Balance;

	void getDetail(){
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter Account No :");
		Account_No =sc.nextLong();
		System.out.print("Enter User Name :");
		User_Name =sc.next();
		System.out.print("Enter Email :");
		Email =sc.next();
		System.out.print("Enter Account Type :");
		Account_Type =sc.next();
		System.out.print("Enter Account Balance :");
		Account_Balance =sc.nextFloat();
	}
     void showDetail(){
		System.out.println("******* Account Detail ******* :");
		System.out.println("Enter Account No :"+Account_No);
		System.out.println("Enter User Name :"+User_Name);
		System.out.println("Enter Email :"+Email);
		System.out.println("Enter Account Type :"+Account_Type);
		System.out.println("Enter Account Balance :"+Account_Balance);
	}
}