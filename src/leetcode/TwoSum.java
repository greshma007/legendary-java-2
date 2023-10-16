package leetcode;

import java.util.Scanner;

/**
 * Given an array of integers nums and an integer target, return indices of the
 * two numbers such that they add up to target.
 */
public class TwoSum {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size of array: ");
		int n = scanner.nextInt();
		int[] input = new int[n];

		System.out.println("Enter the array elements: ");
		for (int i = 0; i < n; i++) {
			input[i] = scanner.nextInt();
		}

		System.out.println("Enter the target value: ");
		int target = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if ((input[i] + input[j]) == target) {
					System.out.println("Output:- ( " + i + " , " + j + " )");
					break;
				}
			}
		}

	}

}
