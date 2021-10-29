package Day2_Assignments;

public class Tshirt {
//Create a T-Shirt  class with the following fields. String color 
//String material String design Create three instances of object based on different sizes like small, large ,  xtra-large.
	String color;
	String material;
	String design;
	
	public Tshirt(String a) {
		this.color=a;
		System.out.println("Inside small constructor");
	}
	public Tshirt(String a,String b) {
		this.color=a;
		this.material=b;
		System.out.println("Inside large constructor");
	}
	
	public Tshirt(String a,String b,String c) {
		this.color=a;
		this.material=b;
		this.design=c;
		System.out.println("Inside x-large constructor");
	}
	
	public void display() {
		System.out.println("Tshirt Color: "+color);
		System.out.println("Tshirt Material: "+material);
		System.out.println("Product Price : "+design);	
		System.out.println();
	}
	public static void main(String[] args) {
		
		Tshirt small=new Tshirt("red");
		small.display();
		Tshirt large=new Tshirt("pink","cotton");
		large.display();
		Tshirt xl=new Tshirt("blue","nylon","sleveless");
		xl.display();

	}

}
