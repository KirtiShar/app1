package pattern;

import java.util.HashMap;

public class CharacterCountUsingHashmap {

	public static void main(String[] args) 
	{
		String s = "automationtester";
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for(int i=1;i<s.length();i++)
		{
			char ch = s.charAt(i);
			
			if(hm.containsKey(ch))
			{
				hm.put(ch, hm.get(ch)+1);
			}
			else
			{
				hm.put(ch, 1);
			}
			
		}
		System.out.println(hm);
	}

}
