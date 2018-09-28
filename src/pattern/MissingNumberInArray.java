package pattern;

public class MissingNumberInArray {

	public static void main(String[] args)
	{
		int [] x = {10,11,12,14,15};
		int k=10;
		for(int i=0;i<x.length;i++)
		{
			if((k)!=x[i])
			{
				break;
			}
			k++;
		}
		System.out.println("Number Missing is "+k);
	}
}