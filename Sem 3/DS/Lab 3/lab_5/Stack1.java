import java.util.*;
import mypop.POP;

public class Stack1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack st = new Stack();
        POP p = new POP();
        st.push();
        st.push();
        st.push();
        p.pop();
        st.peep();
        st.change();
        System.out.print(st);
    }
}

class Stack
{
    int n;
    int[] ar;
    int top;

    Stack()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of stack : ");
        n = sc.nextInt();
        this.top = -1;
        ar = new int[n];
    }

    public void push()
    {
        Scanner sc = new Scanner(System.in);
        if(this.top>=n)
        {
            System.out.print("Stack overflow : ");
        }
        else
        {
            this.top++;
            ar[this.top] = sc.nextInt();
        }
    }

    

    public void peep()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to peep : ");
        int temp = sc.nextInt();

        if((top-temp+1)<0)
        {
            System.out.print("Stack underflow : ");
        }
        else

        {
            System.out.print(ar[top-temp+1] + "\n");
        }
    }

    public void change()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter location : ");
        int temp = sc.nextInt();

        if((top-temp+1)<0)
        {
            System.out.print("Stack underflow : ");
        }
        else
        {
            System.out.print("Enter element : ");
            int el = sc.nextInt();

            this.ar[top-temp+1] = el;
        }
    }

    public String toString()
    {   
        String s="";
        for(int i=0;i<=this.top;i++)
        {
            s+=ar[i] + " ";
        }
        return s;
    }
}