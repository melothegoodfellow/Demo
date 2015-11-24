package primeNos;
public class PrimeSeive {

	void initialise(boolean[] isPrime) {
		for (int i=0; i< isPrime.length;i++)
			isPrime[i]=true;
	}

	int[] copySieve(int size, boolean[] isPrime, int count) {
		int[] primes= new int [count];
		for (int k=0,l=0; l<size; l++ ){														//copy sieve into result
			if (isPrime[l])
				primes[k++]=l;
		}
		return primes;
	}

	int countPrimes(int size, boolean[] isPrime) {
		int count=0;
		for (int i=0; i<size;i++){
			if (isPrime[i])
				count++;
		}
		return count;
	}

	void sievePrimeNos(int size, boolean[] isPrime) {
		for (int i =2; i<size;i++)
			if (isPrime[i])																 	  //cross its multiples
				for (int j=i; (j*i)<size; j++)
					isPrime[i*j]=false;
	}
}