import java.util.ArrayList;
import java.util.Scanner;
/*
 * The purpose of this class is to create a Website class that contains the link and page rank scores. 
 * The class sorts the links through the heap sort algorithm by first creating a heap data structure, building the max 
 * heap and then sorting by the heap sort algorithm
 */
public class Website {
	
	private int index;
	private int pageRank;
	private String url;
	private int totalScore;
	
	public Website(int index, int pageRank, int age, int connections, int subscription, int totalScore, int pageRank2, String url){
		this.index = index;
		this.pageRank = pageRank;
		this.url = url;
		this.totalScore = totalScore;
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

	
	
	///// Implementing Heap Sort 

public int getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}

	/*
 *Gets parent of the current node
 *@param i current node
 *@return the parent node
 */
	public static int getParent(int i)
	{
		return (i - 1) / 2;
	}
	
/*
 * Gets left child of the current node
 * @param i current node
 * @return the left child
 */
	public static int getLeft(int i)
	{
		return (2 * i) + 1;
	}

/*
 * Gets right child of the current node
 * @param i current node
 * @return the right child
 */
	public static int getRight(int i)
	{
		return (2 * i) + 2;
	}
/*
 * Helper method that swaps two objects in an arrayList
 * @param a the index of the first node to be swapped
 * @param b the index of the second node to be swapped
 * @param heap the arralylist that contains the Webiste objects
 */
	public static void swap(Website[] A, int a, int b) {
		Website temp = A[a];
		A[a] = A[b];
		A[b] = temp;
	}

	
/*
 * Arranges a heap in a way that the parents are always greater than its children
 * @param heap contains the heap of the objects 
 * @param i the index at which to begin the max heapify method
 */
	public static void maxHeapify(Website[] heap, int i) 
	{
		int largest = 0; // Variable used to store a the object that has the biggest vales amongst 
						 // the parent and child
		int l = getLeft(i);
		int r = getRight(i);

		// If the parent is less than the child the child would be stored in the 
		// largest variable. If not, the largest would still be the parent
		if (l <= heap.length -1 && (heap[l].getTotalScore() > heap[i].getTotalScore()))
		{
			largest = l;
		} 
		else
		{
			largest = i;
		}
		
		//If the parent is less than the right child, the right right child would be stored into the largest variable
		if(r < heap.length -1 && heap[r].getTotalScore() > heap[i].getTotalScore())
		{
			largest = r; 
		}
		
		// By the end of the if/else sequence, if the largest variable is not equal to the parent node
		// that means one of the children is greater than the parent node.
		// Swap the child with the parent and then max heapify
		if (largest != i)
		{
			swap(heap,largest,i);
			maxHeapify(heap, largest);
		}
	}
	

/*
 * Takes unsorted arrayList and builds a max Heap data structures. 
 * Creates a heap tree where each parent has to be greater than the children
 * @param heap an arrayList that contains all unsorted objects
 */
	
	public static void buildMaxHeap(Website[] heap)
	{ 
		int heapSize = heap.length -1;
		// Divides the heap length by two to separate the parent from the children
		// Creates max heap by checking whether the parents are greater the children by calling
		// the max heap method until it reached the root
		for(int i = (heapSize/2); i >= 0; i--)
		{
			maxHeapify(heap,i);
		}
	}
	
/*
 * Sorts out arrayList based on key values in each object 
 * @param heap the arrayList containing 
 */
	
	public static void heapSort(Website [] heap)
	{
		buildMaxHeap(heap);
		
		for(int i = heap.length-1; i >= 1; i--)
		{
			int length = heap.length-1;
			swap(heap,0, i);
			length--;
			maxHeapify(heap,0);
		}
	}
	
	// Didn't understand how to implement this method
	
	public void maxHeapInsert(ArrayList<Integer> heap, int i, int key)
	{
	
	}
/*
 * Extracts root from heap and restructures
 * @param heap array of websites objects
 * @return the root
 */
	public static Website extractMax(Website[] heap)
	{
		if(heap.length < 0)
		{
			System.out.println("Heap Underflow");
			return null;
		}
		Website max = heap[0];
		heap[0] = heap[heap.length];
		maxHeapify(heap,0);
		return max;
	}
		
	
}
