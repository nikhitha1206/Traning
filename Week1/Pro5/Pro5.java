import java.util.*;
class Pro5
{
	int[] getArray(int n)
	{
		int n1,c;
		int a[]=new int[n+1];
		for(int i=0;i<=n;i++)
		{
			n1=i;
            c=0;
			while(n1>0)
			{
				n1=n1&(n1-1);
				c=c+1;
			}
			a[i]=c;
		}
		return a;
	}
	public static void main(String args[])
	{
		Pro5 p=new Pro5();
       Scanner s=new Scanner(System.in);
	   int n=s.nextInt();
	   int[] a=new int[n+1];
	   a=p.getArray(n);
	   for(int i=0;i<=n;i++)
		   System.out.print(a[i]+" ");
	}
}