package Day1_Assignment;

public class ReversinganArray {
 //program to reverse an array elements
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		System.out.println("Original array :" );
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("array in reverse order :");
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
	}
}
