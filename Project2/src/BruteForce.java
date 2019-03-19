import java.util.Random;
/*
 * Test class
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
				if(tempSum > sum)
				{
					sum = tempSum;
					arrive = i;
					depart = j;
				}			
			}
		}
		if(sum < 0)
		{
			sum = 0;
			arrive = -1;
			depart = 0;
		}
		return sum;
	}
	
	public static void main(String[] args)
	{
		Random random = new Random();
		int[] test1 = {-3, -4, -5, -6, -7};
		BruteForce test = new BruteForce();
		test.findMaxSubArray(test1);
		
		/// Create randome array 
		int[] list = new int[10];
	    for (int i=0; i<10; i++){
	        int n = random.nextInt(50 + 1 +50) - 50;
	        list[i] = n;

	        System.out.println(list[i] + " ");
	    }
		System.out.println("Max Sum: " + test.findMaxSubArray(list));
		System.out.println( "Arrive index not found " + test.arrive);
		System.out.println("Depart index not found " + test.depart);
	}
	
}
