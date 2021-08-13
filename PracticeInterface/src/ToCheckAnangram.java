import java.util.Arrays;

public class ToCheckAnangram {

	public static void main(String[] args) {
		
		String s1="Grab";
		String s2="Brag";
		
		//Converting both to lower case
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		System.out.println("s1="+s1 +"\ns2="+s2);
		
		char[] str1=s1.toCharArray();
		char[] str2=s2.toCharArray();
		
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		System.out.println(str1);
		if(Arrays.equals(str1, str2))
		{
			System.out.println("Word is Anagram");			
		}
		else
			System.out.println("Not an Anagram");
	}

}
