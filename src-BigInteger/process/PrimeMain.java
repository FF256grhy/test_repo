package process;

import java.math.BigInteger;
import prime.Prime;

public class PrimeMain {
	
	public static void main(String[] args) {
		Prime prime = new Prime( new ProcessImplement(true) );
		if(args.length == 0) {
			System.out.println("input numbers at command line argments.");
		} else {
			for(int i = 0; i < args.length; i++) {
				prime.factorization( new BigInteger(args[i]), true );
			}
		}
	}
	
}
