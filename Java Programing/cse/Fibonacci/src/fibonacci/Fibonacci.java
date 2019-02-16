
class Calculation
{
	int x=0,y=1,i=0,n=100,arr[]=new int[100];
	
	Calculation()
	{
		arr[i]=y;
		while(arr[i]<=100)
		{
			i++;
			arr[i]=x+y;
			x=y;
			y=arr[i];
		}
		
	}
	void output()
	{
		for(int k=0;k<i;k++)
		{
			System.out.print(" "+arr[k]);
		}
	}		
	
}
class Fibonacci
{
	public static void main(String args[])
	{
		Calculation a=new Calculation();
		a.output();	
	}
}