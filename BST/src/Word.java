import java.util.ArrayList;

public class Word {

	private String words;
	public int totalScore;
	public static ArrayList<Word> list = new ArrayList<Word>();
	public Word(String words)
	{
		this.words = words;
		totalScore = 0;
	}
	
	public int getTotalScore()
	{
		return totalScore;
	}
	
	public String getName()
	{
		return words;
	}
	
	public static void quickSorts(Word[] A, int p, int r) {
		// Prevents overlap
		if (p < r) {
			// Get partition point
			int q = partitions(A, p, r);
			// Recursively sorts the left side of the partition point
			quickSorts(A, p, q -1);
			// Recursively sorts the right side of the partition point
			quickSorts(A,q + 1, r);
		}
	}
	
	/*
	 * Obtains the partition point from the array
	 * @param A array to be sorted
	 * @param p the beginning index of the array
	 * @param r the last index of the array
	 * @return the partition point
	 */
	public static int partitions(Word[] A, int p, int r) {
		// Represents the pivot
		int pivot = A[r].getTotalScore();
		int i = p - 1;
		for (int j = p; j <= r - 1; j++) {
			if (A[j].getTotalScore() <= pivot) {
				i++;
				swap(A, i, j);
			}
		}
		swap(A, i + 1, r);

		return i + 1;
	}

	public static void swap(Word[] A, int a, int b) {
		Word temp = A[a];
		A[a] = A[b];
		A[b] = temp;
	}
}
