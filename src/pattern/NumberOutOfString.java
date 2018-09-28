package pattern;

public class NumberOutOfString {

	public static void main(String[] args) {
		
			  /*String str = "te12s3t";
			  String numbers="";
			  //extracting string
			  numbers=str.replaceAll("[^0-9]", "");
			  System.out.println("Numbers are: " + numbers);*/
			  
			  
		String str = "abc d 1234567890pqr 54897";
		StringBuilder myNumbers = new StringBuilder();
		for (int i = 0; i < str.length(); i++) 
		{
			if (Character.isDigit(str.charAt(i))) 
			{
					myNumbers.append(str.charAt(i));
					System.out.println(str.charAt(i) + " is a digit.");
			} 
			else 
			{
			        System.out.println(str.charAt(i) + " not a digit.");
			}
		}
		System.out.println("Your numbers: " + myNumbers.toString());

	}

}
