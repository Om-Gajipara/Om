import java.util.*;
public class Prg13{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter size of array :");
		int n=sc.nextInt();
		int arr[]=new int [n];

		for(int i=0;i<arr.length;i++){
			System.out.println("Enter the Number: ");		
			arr[i]=sc.nextInt();
		}
		float num=arr[0];
		int flag=0;
		for(int i=1;i<arr.length;i++){
			if(min==arr[i]){
				flag=1;
			}
		}
		if(flag==1){
		System.out.println("yes duplicat number is containing");
		}
	}
}