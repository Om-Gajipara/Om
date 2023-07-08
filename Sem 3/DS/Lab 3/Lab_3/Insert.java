import java.util.Scanner;

public class Insert
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] ar = new int[n+1];

        System.out.print("Enter array element : ");
        for(int i =0;i<n;i++)
        {
            ar[i] = sc.nextInt();
        }

        ar[n] = 0; 
        System.out.print("Enetr Number : ");
        int num = sc.nextInt();
        System.out.print("Enter Location : ");
        int l = sc.nextInt();
        
        
        for(int i=n;i>=l;i--)
        {
            ar[i] = ar[i-1];
        }
        ar[l-1] = num;

        for(int i=0;i<=n;i++)
        {
            System.out.print(ar[i] + " ");
        }
    }
}