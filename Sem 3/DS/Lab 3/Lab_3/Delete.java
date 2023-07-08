import java.util.Scanner;

public class Delete
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] ar = new int[n];

        System.out.print("Enter array element : ");
        for(int i =0;i<n;i++)
        {
            ar[i] = sc.nextInt();
        }

        System.out.print("Enetr Location : ");
        int l = sc.nextInt();
        
        for(int i = l-1;i<n-1;i++)
        {
            ar[i] = ar[i+1];
        }

        for(int i=0;i<n-1;i++)
        {
            System.out.print(ar[i] + " ");
        }
    }

}