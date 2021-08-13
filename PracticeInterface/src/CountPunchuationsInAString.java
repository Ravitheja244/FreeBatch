
public class CountPunchuationsInAString {

	public static void main(String[] args) {
		
		String s="Samriddh, is a 'good boy'!";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==','||s.charAt(i)=='!'||s.charAt(i)=='/')
			{
				count++;
			}
		}

		System.out.println(count);
	}

}
