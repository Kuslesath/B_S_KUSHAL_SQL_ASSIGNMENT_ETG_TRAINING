package Day1_Assignment;

public class SearchElementArray {
	public static void main(String[] args) {
		//program to search an specific element in an array
		int k=4;
		int a[]= {1,2,3,4,5,6};
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==k) {
				System.out.println("Element found at "+(i+1)+" th posistion");
			}
		}
		
	}

}
