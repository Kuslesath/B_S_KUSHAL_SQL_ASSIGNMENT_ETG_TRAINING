package MyOwnAutoShop;

public class Sedan extends Car{

	int len;
	public Sedan(int a) {
		// TODO Auto-generated constructor stub
		this.len=a;
	}
	public double getSalePrice(int l, double r){
		if (l>20) {
			return r*0.95;
		}
		else return r*0.9;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sedan t=new Sedan(25);
		t.speed=200;
		t.regprice=500000;
		t.color="red";
		t.display();
		System.out.println("length is "+t.len);
		System.out.println("Sale Price is "+t.getSalePrice(t.len,t.regprice));
	}
}
