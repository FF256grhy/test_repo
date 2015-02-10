package process;

import java.math.BigInteger;
import prime.Prime;

public class PrimeMain2 {
	
	public static void main(String[] args) {
		Prime prime = new Prime( new ProcessImplement(true) );
		for(BigInteger i = new BigInteger("2147483647"); i.compareTo(new BigInteger("2147483600")) >= 0;
				i = i.subtract(BigInteger.ONE)) {
			prime.factorization(i, false);
		}
	}
	
}
