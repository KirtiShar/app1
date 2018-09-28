package pattern;
public class ArrayDuplicateWithoutCollection
{
	public static void main(String[] args)
	{
		int a []= {1,2,3,3,3,4,5,5,5,6,7,7,7};
		int [] unique = new int[10];
		int [] duplicate = new int [10];
		int x=0, y=0;
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=0;j<unique.length;j++)
			{
				if(a[i]==unique[j]);
				count++;
			}
			if(count>0)
			{
				duplicate[x++]=a[i];
			}
			else
			{
				unique[y++]=a[i];
			}
		}
	
	}
}
