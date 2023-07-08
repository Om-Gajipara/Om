import java.util.*;
public class P_19
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of first array : ");
        int n = input.nextInt();
        System.out.println("Enter the suize of Secound array : ");
        int m = input.nextInt();

        int[] a = new int[n];
        int[] b = new int[m];

        for(int i=0;i<n;i++){
            System.out.println("Enter Array a["+i+"]");
            a[i]=input.nextInt();
        }
        for(int i=0;i<m;i++){
        System.out.println("Enter Array b["+i+"]");
            b[i]=input.nextInt();
        }
        int[] x = new int[m+n];

        for(int i=0;i<n;i++){
            x[i]=a[i];
        }
        int j=0;
        for(int i=n;i<m+n;i++){
            x[i]=b[j];
            j++;
        }
        for(int i = 0;i<x.length;i++ ){
                System.out.println("array ["+i+"]"+x[i]);
            }

    }
}