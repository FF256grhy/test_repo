package process;

import java.math.BigInteger;
import prime.PrimeFactorList;
import prime.ProcessInterface;

public class ProcessImplement implements ProcessInterface {
	final BigInteger one = BigInteger.ONE;
	
	public boolean isDegreeStyle;
	
	public ProcessImplement(boolean isDegreeStyleArg) {
		isDegreeStyle = isDegreeStyleArg;
	}
	
	public void error(BigInteger num){
		System.out.println(num);
	}
	
	public void start(BigInteger num) {
		System.out.print(num + " = ");
	}
	
	public void found(BigInteger p, BigInteger d, boolean isLastFactor) {
		if(isDegreeStyle) {
			System.out.print(p + (d.compareTo(one) == 0 ? "" : "^" + d) + (isLastFactor ? "" : " * ") );
		} else {
			for(BigInteger i = BigInteger.ZERO; i.compareTo(d) < 0; i = i.add(one) ) {
				System.out.print(p + (isLastFactor && i.compareTo(d.subtract(one)) == 0 ? "" : " * ") );
			}
		}
	}
	
	public void complete(BigInteger num, PrimeFactorList list) {
		System.out.println();
	}
	
}
