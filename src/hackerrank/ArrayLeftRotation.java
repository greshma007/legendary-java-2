package hackerrank;

import java.util.Scanner;

public class ArrayLeftRotation {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter size: ");
			int n = scanner.nextInt();

			int[] arr = new int[n];

			System.out.println("Enter array elements: ");
			for (int i = 0; i < n; i++) {
				arr[i] = scanner.nextInt();
			}

			System.out.println("Enter no. of left rotations: ");
			int d = scanner.nextInt();

			rotateLeftUsingArray(n, arr, d);
		}

	}

	/**
	 * 
	 * @param n
	 * @param arr
	 * @param d
	 */
	private static void rotateLeftUsingArray(int n, int[] arr, int d) {
		
		int p = 1;

		while (p <= d) {
			int limit = n - 1;
			int last = arr[0];
			
			for (int i = 0; i < limit; i++) {
				arr[i] = arr[i + 1];
			}
			arr[limit] = last;
			p++;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
