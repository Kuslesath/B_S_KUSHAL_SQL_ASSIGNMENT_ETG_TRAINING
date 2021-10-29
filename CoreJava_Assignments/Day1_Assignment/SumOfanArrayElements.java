package Day1_Assignment;

public class SumOfanArrayElements {
//program to print sum of all integer array elements
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int sum=0;
		System.out.println("Array Elements are:" );
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		System.out.println("Sum of all array elements is :"+sum);
	}
}
