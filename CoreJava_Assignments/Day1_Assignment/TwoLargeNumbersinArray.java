package Day1_Assignment;

public class TwoLargeNumbersinArray {

	public static void main(String[] args) {
		// program to display largest and second largest element in an array
		int a[]= {1,2,3,4,5,6};
		int l1, l2, temp;
		 
		l1 = a[0];
		l2 = a[1];
 
		if (l1 < l2)
		{
			temp = l1;
			l1 = l2;
			l2 = temp;
		}
 
		for (int i = 2; i < a.length; i++)
		{
			if (a[i] > l1)
			{
				l2 = l1;
				l1 = a[i];
			}
			else if (a[i] > l2 && a[i] != l1)
			{
				l2 = a[i];
			}
		}
 
		System.out.println ("The Largest elemet is " + l1);
		System.out.println ("The Second Largest element is " + l2);
 
	}
	
	}


