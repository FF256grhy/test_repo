package prime;

import java.math.BigInteger;
import java.util.Vector;

public class PrimeFactorList {
	
	private Vector<BigInteger> factor  = new Vector<BigInteger>();
	private Vector<BigInteger> degree  = new Vector<BigInteger>();
	
	public void addFactor(BigInteger p) {
		factor.addElement(p);
	}
	
	public void addDegree(BigInteger d) {
		degree.addElement(d);
	}
	
	public Vector<BigInteger> getFactor() {
		return factor;
	}
	
	public Vector<BigInteger> getDegree() {
		return degree;
	}
	
}
