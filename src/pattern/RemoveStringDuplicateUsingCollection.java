package pattern;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveStringDuplicateUsingCollection
{
	public static void main(String[] args)
	{
		String s = "anananad";
		String str = "";
		Set<Character> set = new LinkedHashSet<>();
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			set.add(c);
		}
		Iterator<Character> it = set.iterator();
		while(it.hasNext())
		{
			str = str + it.next();
		}
		System.out.println(set);
		System.out.println(str);
	}

}
