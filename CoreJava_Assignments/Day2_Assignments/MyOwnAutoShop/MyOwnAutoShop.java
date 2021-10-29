package MyOwnAutoShop;


public class MyOwnAutoShop extends Car {

	MyOwnAutoShop(int a,double b,String c ){
		super(a,b,c);
	}
	public static void main(String args[]) {
		Sedan s=new Sedan(10);
		System.out.println(s.getSalePrice(s.len, s.regprice));
	}
}
