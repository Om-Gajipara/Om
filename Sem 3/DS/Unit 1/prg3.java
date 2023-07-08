import java.util.*;
public class prg3{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter character :");
		char a=sc.next().charAt(0);

		if(a=='A'||a=='a'||a=='E'||a=='e'||a=='I'||a=='i'||a=='O'||a=='o'||a=='U'||a=='u'){
			System.out.println("character ("+a+") is vowel");
		}
		else{
			System.out.println("character ("+a+") is not vowel");
		}
	}
}