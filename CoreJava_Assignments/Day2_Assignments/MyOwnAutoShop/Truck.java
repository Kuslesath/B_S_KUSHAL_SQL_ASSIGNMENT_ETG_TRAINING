package MyOwnAutoShop;

public class Truck extends Car {
	int wt;
	public Truck(int a) {
		// TODO Auto-generated constructor stub
		this.wt=a;
	}
	public double getSalePrice(int w, double r){
		if (w>2000) {
			return r*0.9;
		}
		else return r*0.8;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truck t=new Truck(1800);
		t.speed=200;
		t.regprice=500000;
		t.color="red";
		t.display();
		System.out.println("Weight is "+t.wt+" kgs");
		System.out.println("Sale Price is "+t.getSalePrice(t.wt,t.regprice));
	}

}
