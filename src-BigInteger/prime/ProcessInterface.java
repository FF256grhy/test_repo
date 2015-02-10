package prime;

import java.math.BigInteger;

public interface ProcessInterface {
	
	public void error(BigInteger num);
	public void start(BigInteger num);
	public void found(BigInteger p, BigInteger d, boolean isLastFactor);
	public void complete(BigInteger n, PrimeFactorList list);
	
}
