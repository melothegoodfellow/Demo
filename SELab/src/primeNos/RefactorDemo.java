package primeNos;
/**
 * 
 * @author: Miracle D'souza
 * Rollno: 1309
 * Excerise: Refactoring
 * Refactoring used: extract method,move,rename,extract class,self documented,remove unnecessary comments,correction of logic error
 * 					fit in one window.
 *
 */

public class RefactorDemo {

	public static void main(String[] args) {
		GeneratePrimes generator = new GeneratePrimes();
		generator.generatePrimes(10);
		generator.generatePrimes(25);
	}
}