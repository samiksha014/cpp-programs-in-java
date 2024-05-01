//aim:- implementation of Inheritance 


class operation {

	int x;      //x is a number 
	int n;		//n denotes to exponent
	
	
}

class exponent extends operation {				//functionality 6


	exponent(int x , int n) {
	this.x=x;
	this.n = n;
	}
	
	//method to calculate the value by passing the number as a exponent 
	int exponent ()
	
	{
		int result =1;
		for(int i=1;i<=n;i++)
		{
			result *= x;
		}
		
		return result;
		
	}
	
	public static void main (String args[])
	{
		exponent ex = new exponent(5,4);
		
		//method calling 
		int result = ex.exponent();
		System.out.println(ex.mytostring(result,5,4));
		
	}
	
	String mytostring(int result, int x, int n)
	{
	 return x + "\u2074" + ":" + " " + result;                //it will return the output in exponent format
	 }

}
