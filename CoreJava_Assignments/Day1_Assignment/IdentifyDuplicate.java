package Day1_Assignment;

public class IdentifyDuplicate {

	public static void main(String[] args) {
		// program to identify duplicate value
        int [] arr = new int [] {1,1,2,3,3,4,5,6,6};   
        
        System.out.println("Duplicate elements in given array: ");  
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.print(arr[j]+" "); 
            }  
        }

	}

}
