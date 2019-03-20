/*
 * This is the best algorithm to find for finding the max sub array
 * It efficiently computes the problem in O(n). It does this by iterating through the loop 
 * only once and checks each element if it is below 0. If so, adjusts the pointers for arrive
 * and depart and updates the sum if the temp sum is greater than the max sum
 */
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
	
	// This function is a helper function that would be used for the experimental 
	// analysis. Finds the time to complete the tasks.
	public long findMaxSubArrayTime(int[] A)
	{ 			
		long beginningTime = System.nanoTime();
		for(int i = 0; i < 10; i++)
		{
			findMaxSubArray(A);
		}
		long endTime = System.nanoTime();
		System.out.println("The program took " + ((endTime - beginningTime)/10) + (" nanoseconds"));
		long elapsedTime = (endTime-beginningTime);
		return elapsedTime/10;
	}
}
