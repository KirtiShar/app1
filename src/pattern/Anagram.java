package pattern;
public class Anagram {
	public static void main(String[] args) 
	{
		String s = "abcde";
		String s1 = "bdcae";
		int count=0;
		for(int i=0; i<s.length(); i++)
		{
			for(int j=0;j<s1.length();j++)
			{
				if(s.charAt(i)==s1.charAt(j))
				{
					count++;
				}
			}
		}
		System.out.println("Count "+count);
		if(count==s.length())
		{
			System.out.println("String is Anagram");
		}
		else
		{
			System.out.println("Not anagram");
		}
	}
}
