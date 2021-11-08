package Day4_Assignments;
import java.util.*;

public class Student implements Comparable<Student>{
	
	int sid;
	String name;
	int age;
	int marks;
	
	Student(){}
	
	Student(int s,String n,int a,int m){
		super();
		this.sid=s;
		this.name=n;
		this.age=a;
		this.marks=m;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}
	  @Override
	    public int compareTo(Student c) {
	        int m=c.getMarks();
	        return m-this.marks;

	    }
	
public static void main (String args[]) {
		
		Student s4= new Student(21,"revathi",16,88);
		Student s1= new Student(22,"ramesh",15,77);
		Student s2= new Student(23,"rohini",17,663);
		Student s3= new Student(24,"rohith",16,55);
		
		
		
	ArrayList<Student> stud = new ArrayList<Student>();
		stud.add(s1);
		stud.add(s2);
		stud.add(s3);
		stud.add(s4);
		Collections.sort(stud);
		for (int i=0;i<stud.size();i++)
			System.out.println(stud.get(i));
	}
		
}
