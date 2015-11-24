package primeNos;

public class GeneratePrimes {

	public int generatePrimes(int maxValue){

		if (maxValue < 1)
			return 0;

		int size = maxValue + 1;
		boolean[] isPrime = new boolean[size];
		PrimeSeive seive = new PrimeSeive();

		seive.initialise(isPrime);														 //initialize array
		isPrime[0] = isPrime[1] = false;													 //get rid of known primes
		
		seive.sievePrimeNos(size, isPrime);											     //sieve logic
		int count = seive.countPrimes(size, isPrime);
		int[] primes = seive.copySieve(size, isPrime, count); 
		display(primes, maxValue);
		
		return 1;
	}
	
	public void display(int[] primes,int maxValue) {
		System.out.println("\n\nThe prime numbers in the range of 0 to "+maxValue +" are:");
		for(int i = 0 ;i < primes.length ; i++)
			System.out.print("\t" + primes[i]);
	}
}
