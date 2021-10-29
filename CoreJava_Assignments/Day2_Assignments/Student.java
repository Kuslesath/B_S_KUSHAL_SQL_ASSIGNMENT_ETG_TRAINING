package Day2_Assignments;


public class Student {
//Create student class having stdID , stdName, stdClass and display the information of two objects
	int sid;
	String sname;
	int sclass;
	
	Student(int a,String b,int c){
		//constructor with 3 parameters 
		this.sid=a;
		this.sname=b;
		this.sclass=c;
		}
	
	public void display() {
		System.out.println("Student Id : "+sid);
		System.out.println("Student Name : "+sname);
		System.out.println("Student Class : "+sclass);	
		System.out.println();
	}
	public static void main(String[] args) {
		
		Student s1= new Student(1001,"kushal",7);
		s1.display();
		
		Student s2= new Student(1002,"Derek",10);
		s2.display();
		
	}
}
