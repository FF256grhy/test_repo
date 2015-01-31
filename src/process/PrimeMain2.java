package process;

import prime.Prime;

public class PrimeMain2 {
	
	public static void main(String[] args) {
		Prime prime = new Prime( new ProcessImplement(true) );
		for(int i = 2147483647; 2147483600 <= i; i--) {
			prime.factorization(i, false);
		}
	}
	
}
