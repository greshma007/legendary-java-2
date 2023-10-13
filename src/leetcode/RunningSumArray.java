package leetcode;

import java.util.Scanner;

public class RunningSumArray {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {

			// enter limit of array
			System.out.println("Enter size of array: ");
			int n = scanner.nextInt();

			// creating array
			int[] nums = new int[n];

			System.out.println("Enter array elements: ");

			for (int i = 0; i < n; i++) {
				nums[i] = scanner.nextInt();
			}

			// calculate sum
			RunningSumArray rsa = new RunningSumArray();

			// calling inner class
			SumCalc sumCalc = rsa.new SumCalc();

			int[] sum = sumCalc.runningSum(nums);

			System.out.println("Output: ");
			for (int j = 0; j < sum.length; j++) {
				System.out.print(sum[j] + " ");
			}

		}

	}

	/**
	 * Class to calculate sum
	 * 
	 */
	class SumCalc {

		/**
		 * Calculate running sum
		 * 
		 * @param nums
		 * @return
		 */
		public int[] runningSum(int[] nums) {

			for (int i = 1; i < nums.length; i++) {
				nums[i] = nums[i] + nums[i - 1];
			}
			return nums;

		}

	}
}
