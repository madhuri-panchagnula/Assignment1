package in.ineuron;

public class PatternA1Q1 {

	public static void main(String[] args) {
		int n = 5; // number of rows

		// code for printing letter I
		for (int i = 0; i < n; i++) {
			System.out.print("\n* ");

			System.out.print("    ");

			// code for printing letter N
			for (int j = 0; j < n; j++) {
				if (j == 0 || j == n - 1 || j == i) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.print("    ");
			// code for printing letter E
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || i == n - 1 || i == n / 2) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}

			System.out.print("    ");
			// code for printing letter U
			for (int j = 0; j < n; j++) {
				if ((i == n - 1 && j != 0 && j != n - 1) || (j == 0 && i != n - 1) || (j == n - 1 && i != n - 1)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.print("    ");
			// code for printing letter R
			for (int j = 0; j < n; j++) {
				if ((i == 0 && j != n - 1) || (i == n / 2 && j != n - 1) || j == 0
						|| (j == n - 1 && i != 0 && i != n / 2)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.print("    ");
			// code for printing letter O

			for (int j = 0; j < n; j++) {
				if ((i == 0 && j != 0 && j != n - 1) || (i == n - 1 && j != 0 && j != n - 1)
						|| (j == 0 && i != 0 && i != n - 1) || (j == n - 1 && i != 0 && i != n - 1)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}

			System.out.print("    ");
			// code for printing letter N

			for (int j = 0; j < n; j++) {
				if (j == 0 || j == n - 1 || j == i) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
