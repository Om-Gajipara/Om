import java.util.Scanner;

public class Power
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int power = sc.nextInt();
        int temp = 1;

        for(int i=1;i<=power;i++)
        {
            temp *= base;
        }

        System.out.println(temp);
    }
}