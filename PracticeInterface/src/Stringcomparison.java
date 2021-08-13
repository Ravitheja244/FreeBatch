
public class Stringcomparison {

	public static void main(String[] args) {

		String s1="My name is Ravi";
		String s2="my name is ravi";
		System.out.println(s1.contentEquals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equals(s2));
		
	}

}
