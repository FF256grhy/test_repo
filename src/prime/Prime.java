package prime;

public class Prime {
	
	private ProcessInterface process;
	
	public Prime(ProcessInterface processArg) {
		process = processArg;
	}
	
	public void factorization(int num, boolean isToSqrt) {
		process.start(num);
		if(num < 2) {
			process.error(num);
			return;
		}
		
		PrimeFactorList list = new PrimeFactorList();
		int n = num;
		for(int i = 2; i <= n; i++) {
			if(n % i == 0) {
				int d = 0;
				while(n % i == 0) {
					n /= i;
					d++;
				}
				list.addFactor(i);
				list.addDegree(d);
				process.found(i, d, n == 1);
				if(n == 1) {
					break; // num = 2^31-1(‘f”)‚Ìê‡A‚±‚ê‚ª‚È‚¢‚Æ–³ŒÀƒ‹[ƒv(2^31-1 < i ‚É‚È‚ç‚È‚¢‚½‚ß)
				}
			} else if(isToSqrt && n / i < i + 2) { // i(i+2) < (i+1)^2 ‚É’ˆÓ 
				list.addFactor(n);
				list.addDegree(1);
				process.found(n, 1, true);
				break;
			}
		}
		process.complete(num, list);
	}
	
}
