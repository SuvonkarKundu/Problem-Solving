import javax.swing.*;
class cons
{
    public cons(int n)
    {
    	int k=0,l=1,m,i=0,j=0;
    	int[] a=new int[100];
    	do
    	{
    		a[i]=l;
    		j++;
    		i++;
    		m=k+l;
    		k=l;
    		l=m;
    	}
    	while(l<=n);
    	for(i=0;i<j;i++)
    		System.out.print(" "+a[i]);
    		System.out.print("\n");
    		System.out.print("There are "+j+" numbers");
    }	
}
class Fibocacci
{
	public static void main(String args[])
	{
		int n;
		String b=JOptionPane.showInputDialog("Enter the limit:");
		n=Integer.parseInt(b);
		cons x=new cons(n);
	}
}