package MyOwnAutoShop;

public class Car {
	//Super class or base class
	int speed;
	double regprice;
	String color;
	
	Car(){}
	
	Car(int a, double b, String c){
		this.speed=a;
		this.regprice=b;
		this.color=c;
	}
	//sale-price includes additional tax of 18%
	public double getSalePrice(){
		return this.regprice*1.18;
	}

	public void display() {
		System.out.println("Speed is " + speed);
		System.out.println("Regular price is " + regprice);
		System.out.println("Colour is " + color);
	}
	
	public static void main(String args[]) {
		
		Car c1= new Car(240,500000,"blue");
		c1.display();
		System.out.println("Sale price is " + c1.getSalePrice());
	}

}
