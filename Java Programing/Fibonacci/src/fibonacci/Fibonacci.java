import javax.swing.*;

public class Fibonacci
{
    int []arr=new int[300];
    public Fibonacci(int n)
    {
        int i,j;
        arr[0]=0;
        arr[1]=1;
        for(i=2;i<n;i++)
        {
            arr[i]=arr[i-2]+arr[i-1];
        }
    }
    public static void main(String[] args) 
    {
        String input=JOptionPane.showInputDialog("Your No: ");
        int n=Integer.parseInt(input);
        Fibonacci num=new Fibonacci(n);
        int i;
        for(i=0;i<n;i++)
        {
            System.out.print(num.arr[i]+" ");
        }
    }
}
