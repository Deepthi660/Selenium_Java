package week1.day1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int input=153;
		int temp=input;
		int cube=0,bal;
		
		while (input>0)
		{
			bal=input%10;
			input=input/10;
			cube=cube+(bal*bal*bal);
		
		}
		if (cube==temp)
			System.out.println(temp+"  is an Armstrong no");
		else
		{
			System.out.println("Sum of cube of digits is "+cube);
			System.out.print(temp+"  is not an Armstrong no");
	}
		}

}
