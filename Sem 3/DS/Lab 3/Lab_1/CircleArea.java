import java.util.Scanner;

public class CircleArea
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        double area = 3.14*(double)r*(double)r;
        System.out.println(area);
    }
}