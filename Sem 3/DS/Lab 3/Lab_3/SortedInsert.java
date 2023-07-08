import java.util.Scanner;

public class SortedInsert
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n+1];

        for(int i=0;i<n;i++)
        {
            ar[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++)
        {
            int temp = 0;
            for(int j=i+1;j<n;j++)
            {
                if(ar[i] > ar[j])
                {
                    temp = ar[j];
                    ar[j] = ar[i];
                    ar[i] = temp;
                }
            }
        }
        ar[n] = 0;
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        System.out.print("Enter Location : ");
        int l = sc.nextInt();

        for(int i=n;i>l-1;i--)
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