package primeNumbers;

//Roll No: 1303
//Refactoring:
//			1) Rename some variables to standards of meaningful variable names.
//			2) Extract to methods for some code.
//			3) Extract to class.
//			4) One window view of methods and code.

public class Main
{

	public static void main(String[] args) 
	{
		GeneratePrime prime = new GeneratePrime();
		prime.display(prime.generatePrimes(20));
		

	}

}
