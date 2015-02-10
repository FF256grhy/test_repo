package prime;

import java.math.BigInteger;

public class Prime {
	final BigInteger zero = BigInteger.ZERO;
	final BigInteger one  = BigInteger.ONE;
	final BigInteger two  = one.add(one);
	
	private ProcessInterface process;
	
	public Prime(ProcessInterface processArg) {
		process = processArg;
	}
	
	public void factorization(BigInteger num, boolean isToSqrt) {
		process.start(num);
		if(num.compareTo(two) < 0) {
			process.error(num);
			return;
		}
		
		PrimeFactorList list = new PrimeFactorList();
		BigInteger n = new BigInteger(num.toByteArray() );
		for(BigInteger i = two; i.compareTo(n) <= 0; i = i.add(one) ) {
			if(n.remainder(i).compareTo(zero) == 0) {
				BigInteger d = zero;
				while(n.remainder(i).compareTo(zero) == 0) {
					n = n.divide(i);
					d = d.add(one);
				}
				list.addFactor(i);
				list.addDegree(d);
				boolean isLast = n.compareTo(one) == 0;
				process.found(i, d, isLast);
			} else if(isToSqrt && n.divide(i).compareTo(i.add(one)) <= 0) {
				list.addFactor(n);
				list.addDegree(BigInteger.ONE);
				process.found(n, one, true);
				break;
			}
		}
		process.complete(num, list);
	}
	
}
