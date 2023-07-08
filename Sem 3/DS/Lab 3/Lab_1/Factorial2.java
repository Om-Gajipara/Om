import java.util.Scanner;

public class Factorial2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        System.out.println(fact(r));
    }

    public static int fact(int n)
    {
        if(n == 1 || n == 0)
        {
            return 1;
       }

       else
       {
        return n*fact(n-1);
       }
    }
}