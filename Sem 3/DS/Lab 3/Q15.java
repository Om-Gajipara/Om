import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the size of the array: ");
        n = sc.nextInt();
        int[] arr = new int[n+1];
        for (int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();
        }
        int element, location, temp = arr[0];
        System.out.print("Enter the elements of the array: ");
        element = sc.nextInt();
        System.out.print("Enter the position of the number you want to insert : ");
        location = sc.nextInt();

        for (int i = n-1; i >= location-1; i--) {
            arr[i+1] = arr[i];
        }
        arr[location-1] = element;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}