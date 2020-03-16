import java.util.*;
class ValidParantheses
{
	void Valid(int o,int c,String s)
	{
		if(o==0 && c==0)
			System.out.println(s);
		if(o>c)
			return;
		if(o>0)
			Valid(o-1,c,s+"(");
		if(c>0)
			Valid(o,c-1,s+")");
	}
	public static void main(String args[])
	{
		ValidParantheses v=new ValidParantheses();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		v.Valid(n/2,n/2,"");
	}
}