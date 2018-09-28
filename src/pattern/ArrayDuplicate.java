package pattern;

import java.util.ArrayList;

public class ArrayDuplicate 
{
	public static void main(String[] args) 
	{
		int a []= {2,3,3,3,4,5,5,5,6,7,7,7};
		ArrayList<Integer> unique = new ArrayList<Integer>();
		ArrayList<Integer> duplicate = new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{
			if(!unique.contains(a[i]))
			{
				unique.add(a[i]);
			}
			else
			{
				duplicate.add(a[i]);
			}
		}
		System.out.println("Unique List"+unique);
		System.out.println("Duplicate List"+duplicate);
	}

}
