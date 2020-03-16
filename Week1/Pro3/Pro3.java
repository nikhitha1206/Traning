import java.util.*;
class Pro3
{
//function returns maximum result ai XOR aj
	int getValue(int a[],int n)
	{
		int i,j,max=0,m;
		for(i=0;i<n-1;i++)
		{
			for(j=i+1;j<n;j++)
			{
				m=a[i]^a[j];
				if(m>max)
				max=m;
			}
		}
		return max;

	}
	public static void main(String args[])
	{
		Pro3 p=new Pro3();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		//reading values into array
                for(int i=0;i<n;i++)
			a[i]=s.nextInt();
                System.out.println(p.getValue(a,n));
	}
}
