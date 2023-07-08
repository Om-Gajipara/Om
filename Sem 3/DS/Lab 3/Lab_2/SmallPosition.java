import java.util.Scanner;

public class SmallPosition
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        int min = Integer.MIN_VALUE;
        int p = 0;

        for(int i=0;i<n;i++)
        {
            ar[i] = sc.nextInt();

            if(min >= ar[i])
            {
                min = ar[i];
                p = i;
            }
        }

        System.out.println("Position is " + (p+1));

    }
}