package hackerrank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JumpingOnClouds {

	public static void main(String[] args) {
		int size = 0;
		List<Integer> cloudList = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter size: ");
		size = scanner.nextInt();

		System.out.println("Enter elements: ");
		for (int i = 0; i < size; i++) {
			cloudList.add(scanner.nextInt());
		}

		System.out.println();

		int jumpCount = jumpingOnClouds(cloudList);
		System.out.println("\nMinimum no. of jumps = " + jumpCount);

	}

	/**
	 * If cloud = 1, jump over
	 * if cloud = 0, jump
	 * 
	 * Finding the minimum jumps required
	 * 
	 * @param list
	 */
	private static int jumpingOnClouds(List<Integer> list) {

		int jumpCount = 0;
		int pos = 0;
		int size = list.size();
		
		while (pos < size - 1) {
			 if (pos + 2 < size && list.get(pos + 2) == 0) {
				pos = pos + 2;
			} else {
				pos = pos + 1;
			}
			jumpCount++;
		}

		return jumpCount;

	}

}
