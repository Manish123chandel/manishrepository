package arrayCoding;

public class ReversalAlgorithm {
	public static void main(String[] args) {
		ReversalAlgorithm arr = new ReversalAlgorithm();
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		int d = 3;
		arr.rotateArray(a, d, 12);
		arr.printArray(a, 12);
	}

	private void rotateArray(int[] a, int d, int n) {
		reverseArray(a,0,d-1);
		reverseArray(a,d,n-1);
		reverseArray(a,0, n-1);
		
		
	}

	private void reverseArray(int[] a, int i, int j) {
		while(i<j)
		{
			int t= a[i];
			a[i]=a[j];
			a[j]=t;
			i++;
			j--;
		}
		
	}

	void printArray(int arr[], int size) {
		int i;
		for (i = 0; i < size; i++)
			System.out.print(arr[i] + " ");
	}
}
