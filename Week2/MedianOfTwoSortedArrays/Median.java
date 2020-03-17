import java.util.*;
class Median
{
	int median(int[] a1,int[] a2,int n)
	{
		int[] a3=new int[n+n];
		int i=0,j=0,k=0;
//sorting
		while(i<n && j<n)
		{
			if(a1[i]<a2[j])
			{
				a3[k]=a1[i];
				i++;
				k++;
			}
			else
			{
				a3[k]=a2[j];
				j++;
				k++;
			}
		}
		while(i<n)
		{
			a3[k]=a1[i];
			i++;
			k++;
		}
		while(j<n)
		{
			a3[k]=a2[j];
			j++;
			k++;
		}
		int m=n+n;
//return median
		return (a3[m/2]+a3[m/2-1])/2;
	}
	public static void main(String args[])
	{
		Median m=new Median();
		Scanner s=new Scanner(System.in);
		int n;
		n=s.nextInt();
		int a1[]=new int[n];
		int a2[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a1[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			a2[i]=s.nextInt();
		}
	    System.out.println(m.median(a1,a2,n));
	}
}