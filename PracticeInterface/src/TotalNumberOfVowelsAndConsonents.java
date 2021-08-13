
public class TotalNumberOfVowelsAndConsonents {

	public static void main(String[] args) {

		String s="This is a really simple sentence";
		int consonentCount=0;
		int vowelCount=0;
		int totalCharactersCount=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				totalCharactersCount++;
			}
		}
		
		System.out.println("Total number of characters excluding spaces = "+totalCharactersCount);
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				vowelCount++;
			}
		}
		consonentCount=totalCharactersCount-vowelCount;
		System.out.println("Total Number of Vowel Count is: "+vowelCount);
		System.out.println("Total Number of Consonent count is: "+consonentCount);
		}

}
