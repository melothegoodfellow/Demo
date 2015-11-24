package primeNumbers;

//prime numbers using sieve of Eratosthenes

public class GeneratePrime
{
	public void display(int[] primes)
	{
		
		for (int j = 0; j < primes.length; j++) {

			System.out.println(primes[j]);
		}
	}

	public int[] generatePrimes(int maxValue)
	{
		Seive seive = new Seive();
		if (maxValue <1)
			return new int[0];

		int size=maxValue+1;

		boolean[] booleanArray = new boolean[size];

		//initialize array
		seive.intializeArray(booleanArray);

		//get rid of known primes
		booleanArray[0]=booleanArray[1]=false;

		//sieve
		seive.sieveAlgorithm(size, booleanArray);

		//how many primes
		int count = seive.countPrime(size, booleanArray);
		int[] primes= new int [count];

		//copy sieve into result
		seive.copySieveResult(size, booleanArray, primes);
		return primes;
	}

}

