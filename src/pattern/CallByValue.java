package pattern;

public class CallByValue 
{
	public static void main(String[] args) 
	{
		String s="automation";
        String rev="";
        for(int i=s.length()-1;i>=0;i--)
        {
               if(i>0)
               {
               rev=rev+s.substring(i-1,i);
               }
        }
        System.out.println(s);
        System.out.println(rev);

	}

}
