package process;

import prime.PrimeFactorList;
import prime.ProcessInterface;

public class ProcessImplement implements ProcessInterface {
	
	public boolean isDegreeStyle;
	
	public ProcessImplement(boolean isDegreeStyleArg) {
		isDegreeStyle = isDegreeStyleArg;
	}
	
	public void error(int num){
		System.out.println(num);
	}
	
	public void start(int num) {
		System.out.print(num + " = ");
	}
	
	public void found(int p, int d, boolean isLastFactor) {
		if(isDegreeStyle) {
			System.out.print(p + (d == 1 ? "" : "^" + d) + (isLastFactor ? "" : " * ") );
		} else {
			for(int i = 0; i < d; i++) {
				System.out.print(p + (isLastFactor && i == d - 1 ? "" : " * ") );
			}
		}
	}
	
	public void complete(int num, PrimeFactorList list) {
		System.out.println();
	}
	
}
