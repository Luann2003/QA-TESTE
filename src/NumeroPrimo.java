
public class NumeroPrimo {

	public static void main(String[] args) {

		int n = 7;

		if (isTrue(n)) {
			System.out.println(n + " Numero primo");
		}
	}

	static boolean isTrue(int n) {
		for (int j = 2; j < n; j++) {
			if (n % j == 0) {
				return false;
			}

		}
		return true;
	}

}
