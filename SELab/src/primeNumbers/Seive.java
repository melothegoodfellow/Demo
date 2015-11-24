package primeNumbers;

public class Seive
{
	public  void copySieveResult(int size, boolean[] booleanArray, int[] primes) 
	{
		for (int k=0,l=0; l<size; l++ )
		{
			if (booleanArray[l])
				primes[k++]=l;
		}
	}

	public  int countPrime(int size, boolean[] booleanArray)
	{
		int count=0;
		for (int i=0; i<size;i++)
		{
			if (booleanArray[i])
				count++;
		}
		return count;
	}

	public  void sieveAlgorithm(int size, boolean[] booleanArray)
	{
		for (int i =2; i< Math.sqrt(size)+1;i++)
		{
			if (booleanArray[i])
			{
				//cross its multiples
				for (int j=i; (i*j)<size; j++)
				{
					booleanArray[i*j]=false;
				}
			}
		}
	}

	public void intializeArray(boolean[] booleanArray) 
	{
		for (int i=0; i< booleanArray.length;i++)
		{
			booleanArray[i]=true;
		}
	}
}
