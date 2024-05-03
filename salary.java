// aim :- Write a Java program to create a class Employee with a method called calculateSalary(). Create two subclasses Manager and Programmer
 //In each subclass, override the calculateSalary() method to calculate and return the salary based on their specific roles. 
 
 
 import java.util.Scanner;
 
 class Employee {
 
 	int a;          //base salary per month
 	int b;          //bonus 
 	
 	int totalsalary;
 	
 	int calculatesalary (int a , int b){
 		
 		 totalsalary = a + b;
 		System.out.println("Total Salary per month :- ");
 		
 		return totalsalary;
 	}
 	
 }
 	
 class Manager extends Employee {
 
 
 		Manager(int a, int b)
 		{
 			this.a = a;
 			this.b = b;
 		}
 
 		int calculatesalary (int a , int b){
 		
 		 totalsalary = a + b;
 		System.out.println("Total Salary per month :- "+totalsalary);
 		
 		
 		return totalsalary;
 	}
 	
 	 public static void main(String args[])
 	{
 		Manager m = new Manager(1000000,20000);
 		
 		Scanner sc = new Scanner(System.in);
 		
 		
 		System.out.println("Enter post");
 		String post = sc.nextLine();
 	
 		System.out.println("Post :- "+post);
 		m.calculatesalary(1000000,20000);
 		
 		
 		sc.close();
 		
 	}
}
 	
 class Programmer extends Employee {
 
 		int c;     //commission for extra hour work
 		
 		Programmer(int a, int b, int c)
 		{
 			this.a = a;
 			this.b = b;
 			this.c = c;
 		}
 
 		int calculatesalary (int a , int b , int c){
 		
 		 totalsalary = a + b + c;
 		System.out.println("Total Salary :- "+totalsalary);
 		
 		
 		return totalsalary;
 	}
 	
 	
 	public static void main(String args[])
 	{
 		Programmer p = new Programmer(50000,10000,6000);
 		
 		Scanner sc = new Scanner(System.in);
 		
 		System.out.println("Enter post");
 		String post = sc.nextLine();
 	
 		System.out.println("Post :- "+post);
 	
 		p.calculatesalary(50000,10000,6000);
 		
 		sc.close();
	 }
 }
 	
 	
