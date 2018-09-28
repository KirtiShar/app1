package pattern;

public class NullPointerExceptionOccur {

	public static void main(String[] args) {
		Object obj = null;
		obj.hashCode();
		String s = null;
		s.hashCode();

	}

}
