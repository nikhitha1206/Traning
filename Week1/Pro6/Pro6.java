import java.util.*;
class Pro6
{
	int[] getValue(int a[],int n)
	{       
                int m=100;
		int f[]=new int[m];
		for(int i=0;i<m;i++)
		{
			f[0]=0;
		}
		for(int i=0;i<n;i++)
		{
			f[a[i]]++;
		}
		return f;
	}
	public static void main(String args[])
	{
		Pro6 p=new Pro6();
		Scanner s=new Scanner(System.in);
		int a[]=new int[100];
		int f[]=new int[100];
		int n=s.nextInt();
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
                f=p.getValue(a,n);
		for(int i=0;i<100;i++)
		{
			if(f[i]==0)
				continue;
			if(f[i]<3)
			{
				System.out.println(i);
			    break;
			}
		}

	}
}