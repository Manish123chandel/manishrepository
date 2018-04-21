package arrayCoding;

public class ArrayRotation {
	
public static void main(String[] args) {
	ArrayRotation arr = new ArrayRotation();
	int a[]= {1,2,3,4,5,6,7,8,9,10,11,12};
	int d=3;
	arr.rotateArray(a,d,12);
	arr.printArray(a, 12);
	
}

private void rotateArray(int[] a, int d, int n) {
      for(int i=0;i<gcd(d,n);i++)
      {
    	 int temp = a[i];
    	 int j=i;
    	 while(true)
    	 {
    		 int k = j+d;
    		 if(k>=n)
    			 k=k-n;
    		 if(k==i)
    			 break;
    		 a[j]=a[k];
    		 j=k;
    	 }
    	 a[j] = temp;
      }
}

void printArray(int arr[], int size) 
{
    int i;
    for (i = 0; i < size; i++)
        System.out.print(arr[i] + " ");
}

private int gcd(int d, int n) {
	if(n==0)
		return d;
	return gcd(n,d%n);
}

}
