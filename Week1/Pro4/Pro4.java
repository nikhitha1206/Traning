import java.util.*;
class Pro4
{
	int getValue(int n)			// inappropriate method name
	{
		int c=0,p;
		while(n!=1)
		{
			p=n&1;
			if(p==1)		
			{
				if(Integer.bitCount(n-1)<Integer.bitCount(n+1))	// use curly braces
					n=n-1;
				else
               				n=n+1;

			}
			else if(p==0)			//else if not required. only else also works
			{
				n=n/2;
		    }					// indentation issue
			c++;
		}
		return c;
	}
	public static void main(String args[])
	{
		Pro4 p=new Pro4();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
        System.out.println(p.getValue(n));
	}
}
