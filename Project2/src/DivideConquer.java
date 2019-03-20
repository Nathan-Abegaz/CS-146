/*
 * This approach utilizes the divide and conquer approach. It is much more efficient than
 * the brute force approach. It recursively divides the array and finds the maximum sum 
 * afterwards it continues to merge and find the max sum for both left and right. 
 * Also it max sum would need to be found for the crossing of both left and right. This algorithm 
 * takes O(nlgn).
 */
public class DivideConquer {

	int arrive = 0;
	int depart = 0;

	int maxLeft = 0;
	int maxRight = 0;

	public int findMaxCrossing(int[] A, int low, int mid, int high) {
		// finds the max sum in left array
		int leftSum = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = mid; i >= low; i--) {
			sum += A[i];
			if (sum > leftSum) {
				leftSum = sum;
				arrive = i;
			}
		}

		// finds the max sum in the right array
		int rightSum = Integer.MIN_VALUE;
		sum = 0;
		for (int j = mid + 1; j <= high; j++) {
			sum += A[j];
			if (sum > rightSum) {
				rightSum = sum;
				depart = j;
			}
		}
		return leftSum + rightSum;
	}

	public int findMaxSubArray(int[] A, int low, int high) {
		if (low == high) {
			return A[low];
		}

		int mid = (low + high) / 2;
		
		// Finds maximum between left and right
		int leftRightMax = Integer.max(findMaxSubArray(A, low, mid), findMaxSubArray(A, mid + 1, high));
		
		// Finds maximum between crossing 
		if (Integer.max(leftRightMax, findMaxCrossing(A, low, mid, high)) <= 0) {
			arrive = -1;
			depart = 0;
			return 0;
		}
		return Integer.max(leftRightMax, findMaxCrossing(A, low, mid, high));
	}

	// This function is a helper function that would be used for the
	// experimental
	// analysis. Finds the time to complete the tasks.
	public long findMaxSubArrayTime(int[] A, int low, int high) {
		long beginningTime = System.nanoTime();
		for (int i = 0; i < 10; i++) {
			findMaxSubArray(A, low, high);
		}
		long endTime = System.nanoTime();
		System.out.println("The program took " + ((endTime - beginningTime) / 10) + (" nanoseconds"));
		long elapsedTime = (endTime - beginningTime);
		return elapsedTime / 10;
	}


}
