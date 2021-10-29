package Day2_Assignments;

public class Product {
//Create a product class The properties are ProID, ProName, ProPrice display the information and ProPrice will be added additional tax of GST .
	int pid;
	String pname;
	int pprice;
	
	public Product(int a,String b,int c) {
		this.pid=a;
		this.pname=b;
		this.pprice=c;
	}
	//Calculating tax
	public void addTax() {
		System.out.println(" Product Price after adding 18% tax is :"+(this.pprice*1.18));
		System.out.println();
	}
	public void display() {
		System.out.println("Product Id : "+pid);
		System.out.println("Product Name : "+pname);
		System.out.println("Product Price : "+pprice);	
		
	}
	public static void main(String[] args) {
		Product p=new Product(10,"Milk",25);
		p.display();
		p.addTax();
		
		Product p1=new Product(11,"Eggs",100);
		p1.display();
		p1.addTax();

	}

}
