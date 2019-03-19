
public class KadaneAlgorithm {
	
	public int maxSum = 0;
	public int maxTemp = 0;
	public int arrive = -1;
	public int depart = -1;
	public int tempArrive = 0;
	
	public int findMaxSubArray(int[] A)
	{
		for(int i = 0; i < A.length; i++)
		{
			maxTemp += A[i];
			if(maxTemp < 0)
			{
				maxTemp = 0;
				arrive = i + 1;
			}
			
			if(maxSum < maxTemp)
			{
				maxSum = maxTemp;
				depart = i;
				tempArrive = arrive;
			}
		}
		arrive = tempArrive;	
		if(maxSum <= 0)
		{
			arrive = -1;
			depart = 0;
		}
		return maxSum;
	}
	
	public static void main(String[] args)
	{
		int[] test1 = {-3, -4, -5, -6, -7};
		int[] input5 = {15, -42, 40, -33, -47, 13, -27, 1, -39, -41, 11,
				33, 4, -18, -44, 43, 39, -20, -23, 5, 12, 19, -12,
				46, -19, -2, 35, -16, -45, -14, 16, -35, -24, -15,
				2, -30, -13, 24, -50, 7, -10, 0, -4, 6, 42, 9, -31,
				-34, -1, 21, 36, -7, -36, -17, 32, 10, -32, 48, 18,
				-43, 31, 30, 25, 23, -29, -40, 45, -3, 41, 17, -46,
				-5, 34, 49, 3, 37, 14, 22, -38, -49, -37, -22, 47, 27,
				-11, 29, -48, -26, 38, -21, -25, -9, 20, 8, 44, 26, -8,
				-6, -28, 28};
		KadaneAlgorithm test = new KadaneAlgorithm();
		test.findMaxSubArray(test1);
		System.out.println("Max Sum: " + test.findMaxSubArray(test1));
		System.out.println( "Arrive index not found " + test.arrive);
		System.out.println("Depart index not found " + test.depart);
		System.out.println("Length of input5 " + input5.length);

	}
	
}
