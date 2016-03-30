public class RecursionTests {
	public static int fact(int n) {
		if (n == 0)
			return 1;
		if (n < 0)
			return 0;
		return fact(n - 1) * n;
	}

	public static int fib(int n) {
		if (n == 1)
			return 1;
		if (n == 2)
			return 1;
		return fib(n - 1) + fib(n - 2);
	}

	public static long ackermann(long x, long y) {
		if (x == 0)
			return y + 1;
		if (y == 0)
			return ackermann(x - 1, y);
		return ackermann(x - 1, ackermann(x, y - 1)); 
	}
}
