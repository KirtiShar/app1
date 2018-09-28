package pattern;

public class ReverseStringWithoutCharAt {

	public static void main(String[] args) 
	{
		String s1="automation";
		String rev = "";
		char ch[] = s1.toCharArray();
		for(int i=s1.length()-1; i>=0;i--)
		{
			rev = rev +ch[i];
		}
		System.out.println(s1);
		System.out.println(rev);
	}

}
