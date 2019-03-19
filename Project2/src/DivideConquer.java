
public class DivideConquer {

	 int arrive = 0;
	 int depart = 0;

	int max_left = 0;
	int max_right = 0;
	
	public int findMaxCrossing(int[]A, int low, int mid, int high)
	{
		int left_sum = Integer.MIN_VALUE;
		int sum = 0;
		for(int i = mid; i >= low; i--)
		{
			sum += A[i];
			if(sum > left_sum)
			{
				left_sum = sum;
				arrive = i;
			}
		}
		
		int right_sum = Integer.MIN_VALUE;
		sum = 0;
		for(int j = mid + 1; j <= high; j++)
		{
			sum += A[j];
			if(sum > right_sum)
			{
				right_sum = sum;
				depart = j;
			}
		}
		return left_sum + right_sum;
	}
	
	public int findMaxSubArray(int []A, int low, int high)
	{
		if(low == high)
		{
			return A[low];
		}
		
		int mid = (low + high) / 2;
		int leftRightMax = Integer.max(findMaxSubArray(A,low,mid), findMaxSubArray(A,mid +1, high));
		if(leftRightMax > findMaxCrossing(A,low,mid,high))
		{
					arrive = low;
		}
		return Integer.max(leftRightMax,findMaxCrossing(A,low,mid,high));
	}

	public static void main(String[] args) {
		int[] test1 = {15, -42, 40, -33, -47, 13, -27, 1, -39, -41, 11,
				33, 4, -18, -44, 43, 39, -20, -23, 5, 12, 19, -12,
				46, -19, -2, 35, -16, -45, -14, 16, -35, -24, -15,
				2, -30, -13, 24, -50, 7, -10, 0, -4, 6, 42, 9, -31,
				-34, -1, 21, 36, -7, -36, -17, 32, 10, -32, 48, 18,
				-43, 31, 30, 25, 23, -29, -40, 45, -3, 41, 17, -46,
				-5, 34, 49, 3, 37, 14, 22, -38, -49, -37, -22, 47, 27,
				-11, 29, -48, -26, 38, -21, -25, -9, 20, 8, 44, 26, -8,
				-6, -28, 28};
		DivideConquer test = new DivideConquer();
		test.findMaxSubArray(test1, 0, test1.length-1);
		System.out.println("Max Sum: " + test.findMaxSubArray(test1, 0, test1.length - 1));
		System.out.println("Arrive index not found " + test.arrive);
		System.out.println("Depart index not found " + test.depart);
	}

}
