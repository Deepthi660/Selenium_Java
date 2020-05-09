package week1.day1;

public class SumOfDigits {

	public static void main(String[] args) {
		int input=123;
		int bal,sum=0;
		int temp=input;
		
		
		do {
			
			bal=input%10;
			sum=sum+bal;
			input=input/10;
		}	while(input>0);
		
		System.out.print("Sum of digits in "+temp+" is "+sum );		
	
	}
}
