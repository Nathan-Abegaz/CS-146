/*
 * This class finds the max-sub array of by the naive approach, also known as the brute force.
 * approach uses two for loops and iterates all possible combinations in an array until the max subbarray 
 * is found. The time complexity of this approach is O(n^2) 
 */ 
public class BruteForce {

	 private int sum = Integer.MIN_VALUE;
	 int arrive = 0;
	 int depart = 0;
	 
	private int tempArrive = 0;
	private int tempDepart = 0;
	
	public int findMaxSubArray(int[] A)
	{
		for(int i = 0; i < A.length; i++)
		{
			int tempSum = 0;
			for(int j = i; j < A.length; j++)
			{
				tempSum += A[j];
				// The moment the temporary sum is greater than the sum 
				// the result is updates. 
				if(tempSum > sum)
				{
					sum = tempSum;
					arrive = i;
					depart = j;
				}			
			}
		}
		
		// handles special case if there are no days that are positive. 
		if(sum < 0)
		{
			sum = 0;
			arrive = -1;
			depart = 0;
		}

		return sum;
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
