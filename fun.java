//aim:- program to use function overloading 
import java.util.Scanner;

class overloading {

	int a ;                  //a and b are marks of the particular subject 
	int b ;
	
}

class operation extends overloading {

	operation (int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	void fun(int rollno)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Roll No :- "+rollno);         //indicated to get the rollno of a particular student to get the marks of both the subjects
		
		System.out.println();
		
		System.out.println("Enter your Branch Name");         //indicated to get the branch name of the student to make it easy to generate the marks
		String Branch = sc.nextLine();
		System.out.println("Branch:- "+Branch);
		
		sc.close();
		
	}
	
	void fun(int a, int b)
	{
		System.out.println("marks of Engineering drawing:- "+a);
		System.out.println("marks of Engineering physics:- "+b);
	
	}
	
	public static void main(String args[])
	{
		operation op = new operation(85,70);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your rollno");		//indicated to enter the rollno of a particular student to get the marks of both the subjects
		int rollno = sc.nextInt();
		
		op.fun(rollno);
		System.out.println();
		op.fun(85,70);
		
		sc.close();
		
	}
		
}
	
