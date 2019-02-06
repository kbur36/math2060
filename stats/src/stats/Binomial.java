package stats;

import java.util.*;
import java.math.*;

public class Binomial {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double k, n, p, j;

		System.out.println("Recall: B(k; n, p); j = start of constraint");
		System.out.println("k = ");
		k = kb.nextDouble();
		System.out.println("n = ");
		n = kb.nextDouble();
		System.out.println("p = ");
		p = kb.nextDouble();
		System.out.println("j = ");
		j = kb.nextDouble();
		
		System.out.print(cdf(k, n, p, j));

		// j = lower bound
		// k = upper bound 
		//
	}

	private static double cdf(double k, double n, double p, double j) {
		double ret = 0;
		for (double i = j; i <= k; i++) {
			ret += ( choose(n, i) * Math.pow(p, i) *  Math.pow((1-p), (n-i)));
		}
		return ret;
	}

	private static double fac(double n) {
		if (n == 0 || n == 1)
			return 1;
		else 
			return fac(n-1) * n;
	}

	private static double choose(double n, double k) {
		return (fac(n) / (fac(k) * fac(n - k)));
	}
}
