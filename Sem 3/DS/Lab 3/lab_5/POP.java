package mypop;

public class POP
{
    public void pop()
    {
        if(top<0)
        {
            System.out.print("Stack Underflow : ");
        }
        else
        {
            (top--);
        }
    }
}