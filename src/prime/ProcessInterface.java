package prime;

public interface ProcessInterface {
	
	public void error(int num);
	public void start(int num);
	public void found(int p, int d, boolean isLastFactor);
	public void complete(int n, PrimeFactorList list);
	
}
