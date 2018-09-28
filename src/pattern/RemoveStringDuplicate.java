package pattern;

public class RemoveStringDuplicate
{
	public static void main(String[] args) 
	{
		String s = "anananad";
		String str = "";
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			String s1 = Character.toString(c);
			if(!str.contains(s1))
			{
				str=str+s1;
			}
			
		}
		System.out.println(str);
	}
}
