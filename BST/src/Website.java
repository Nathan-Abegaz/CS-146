
public class Website {
	
	private int index;
	private int frequency,year,connections, subscription,totalScore;
	private int pageRank;
	private String url;
	
	public Website(int index, int frequency, int age, int connections,int subscription, int totalScore, int pageRank, String url)
	{
		this.index = index;
		this.frequency = frequency;
		this.year = age;
		this.connections = connections;
		this.subscription = subscription;
		this.totalScore = totalScore;
		this.pageRank = pageRank;
		this.url = url;
	}
	
		public int getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}

		public int getFrequency() {
		return frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	public int getAge() {
		return year;
	}

	public void setAge(int age) {
		this.year = age;
	}

	public int getConnections() {
		return connections;
	}

	public void setConnections(int connections) {
		this.connections = connections;
	}

	public int getSubscription() {
		return subscription;
	}

	public void setSubscription(int subscription) {
		this.subscription = subscription;
	}

		public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public int getPageRank() {
		return pageRank;
	}

	public void setPageRank(int pageRank) {
		this.pageRank = pageRank;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	/*
	 * Recursive methods that partitions the array to sorted sub-array
	 * @param A array to be sorted 
	 * @param p the beginning index of the array
	 * @param r the last index of the array
	 */
	public static void quickSort(Website[] A, int p, int r) {
		// Prevents overlap
		if (p < r) {
			// Get partition point
			int q = partition(A, p, r);
			// Recursively sorts the left side of the partition point
			quickSort(A, p, q -1);
			// Recursively sorts the right side of the partition point
			quickSort(A,q + 1, r);
		}
	}
	
	/*
	 * Obtains the partition point from the array
	 * @param A array to be sorted
	 * @param p the beginning index of the array
	 * @param r the last index of the array
	 * @return the partition point
	 */
	public static int partition(Website[] A, int p, int r) {
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

	public static void swap(Website[] A, int a, int b) {
		Website temp = A[a];
		A[a] = A[b];
		A[b] = temp;
	}
}
