package Day1_Assignment;

public class ReplacingVowel {
	public static void main(String[] args) {
		//program to replace vowels with $ symbol
		
		char a[]= {'h','e','l','l','o'};
		System.out.println("original string is ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
		System.out.println();
		System.out.println("string after replacing vowels with $ : ");
		for(int i=0;i<a.length;i++) {
			if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'||a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U') {
				a[i]='$';
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
		
	}

}
