package pattern;

public class RemoveExtraSpaces {

	public static void main(String[] args) {
		String s = "My    name    is   Kirti";
		String str = "";
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			if(c==' ')
			{
				if(s.charAt(i-1)!=c)
				{
					str=str+c;	
				}
			}
			else
			{
				str=str+c;
			}
			
		}
		System.out.println(str);

	}

}
