public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int sumOfDigits(int k) {

			if(k < 0)
				k*=-1;
			if(k < 10)
				return k;
			return sumOfDigits(k / 10) + k % 10;
		
	}
	public static int factorial(int a) {
		if(a == 0)
			return 1;
		else if(a < 0)
			return 0;
		
		return a * factorial(a-1);
	}

}