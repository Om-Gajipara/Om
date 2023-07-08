import java.util.Scanner;

public class Replace
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        int a,b,pa,pb;
        System.out.print("Enter a: ");
        a = sc.nextInt();
        System.out.print("Enter b: ");

        b = sc.nextInt();
        pa = 0;
        pb = 0;

        for(int i=0;i<n;i++)
        {
            ar[i] = sc.nextInt();

            if(ar[i] == a)
            {
                pa = i;
            }
            if(ar[i] == b)
            {
                pb = i;
            }
        }

        ar[pa] = b;
        ar[pb] = a;

        for(int i=0;i<n;i++)
        {
            System.out.print(ar[i] + " ");
        }

        System.out.print(pa + " " + pb);

    }
}