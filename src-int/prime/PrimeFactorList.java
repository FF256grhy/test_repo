package prime;
import java.util.Vector;

public class PrimeFactorList {
	
	private Vector<Integer> factor  = new Vector<Integer>();
	private Vector<Integer> degree  = new Vector<Integer>();
	
	public void addFactor(int p) {
		factor.addElement(p);
	}
	
	public void addDegree(int d) {
		degree.addElement(d);
	}
	
	public Vector<Integer> getFactor() {
		return factor;
	}
	
	public Vector<Integer> getDegree() {
		return degree;
	}
	
}
