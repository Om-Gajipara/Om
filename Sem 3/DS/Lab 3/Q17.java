import java.util.*;
public class Q3 {
    

    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size =  input.nextInt();
        
        int[] array = new int[size];
        System.out.println("Enter the elements of the array :");
        for (int i = 0; i < size; i++){
            array[i] = input.nextInt();
        }
        System.out.print("Enter the position of the number you want to delete: ");
        int position = input.nextInt();
        
        for (int i = position; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
         array[size - 1] = 0;

        System.out.print("The new array is: ");
        for (int i = 0; i < size-1; i++) {
            System.out.print(array[i] + " ");
        }



    }
}
