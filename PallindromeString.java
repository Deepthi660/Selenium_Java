package week1.day2;

public class PallindromeString {

	public static void main(String[] args) {
		String s="Madam";
		System.out.print(s);
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
						rev=rev+s.charAt(i);
		
		}
		
		if(s.equalsIgnoreCase(rev))
			System.out.print(" is a pallindorme string");
		else
			System.out.print(" is not a pallindrome string");
	}
}
