//aim:- write a program to find whether the number is a palindrome or not 
import java.util.Scanner;

class palindrome{
	
	int number;
	
	
	void num()
	{
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		System.out.println("The given input number is given as:- "+number);
		
		int num1 = 0;
		int no = number;
		
		while(number > 0)
		{
			int mod = number % 10;
			num1 = (num1*10)+mod;
			number = number/10;
		}
		
		if(no == num1)
		{
			System.out.println("The number is palindrome number");
		}
		else{
			System.out.println("The given number is not a palindrome number");
		}
		
	}
	
	public static void main(String args[])
	{
		palindrome p = new palindrome();
		p.num();
	}
}
			
			
		
		
