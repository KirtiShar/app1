package pattern;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ArrangeTheNumberinOrder {

	public static void main(String[] args) {
		int num = 23254891;
		int revNum = 0;
		System.out.println("Number is "+num);
		List<Integer> list = new ArrayList<Integer>();
		while(num>0)
		{
			list.add(num%10);
			num = num/10;
		}
		Collections.sort(list);
		//System.out.println(list);
		Collections.reverse(list);
		//System.out.println(list);
		for(int i=0;i<list.size();i++)
		{
			revNum = revNum*10 + list.get(i);
		}
		System.out.println("Descending order "+revNum);
	}

}
