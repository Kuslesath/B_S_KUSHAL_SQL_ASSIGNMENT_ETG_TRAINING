package Day1_Assignment;

public class CountDuplicate {

	public static void main(String[] args) {
		// program to count duplicate value
        int a[] = new int [] {1,1,2,3,3,4,4,5,6,6};   
        int k=0;
        System.out.println("count of duplicate elements in array: ");  
        for(int i = 0; i < a.length; i++) {  
            for(int j = i + 1; j < a.length; j++) {  
                if(a[i] == a[j])  
                    k++; 
            }  
        }
        System.out.println(k);
	}

}
