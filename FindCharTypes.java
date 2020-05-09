package week1.day2;

public class FindCharTypes {

	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int length =test.length();
		int letterCount=0;
		int spaceCount=0;
		int splcharCount=0;
		int digitCount=0;
		 //using charAT()
		for(int i=0;i<length;i++)
		{
			if (Character.isLetter(test.charAt(i)))
					letterCount++;
			else if(Character.isDigit(test.charAt(i)))
					digitCount++;
			else if(Character.isSpaceChar(test.charAt(i)))
				spaceCount++;
			else
				splcharCount++;
		}
		System.out.println("No.of characters = "+letterCount);
		System.out.println("No.of Spclcharacters = "+splcharCount);
		System.out.println("No.of space = "+spaceCount);
		System.out.println("No.of digits = "+digitCount);
		
	}
}

