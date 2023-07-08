import java.util.Scanner;

public class Duplicate
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        int count = 0;

        for(int i=0;i<n;i++)
        {
            ar[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(ar[i] == ar[j])
                {
                    count++;
                }
            }
        }

        if(count > 0)
        {
            System.out.println("Contains Duplicate");
        }
        else
        {
            System.out.println("Not Contains Duplicate");
        }
    }
}