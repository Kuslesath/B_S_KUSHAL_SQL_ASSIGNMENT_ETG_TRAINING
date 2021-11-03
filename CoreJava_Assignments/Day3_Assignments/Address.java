package Day3_Assignments;

public class Address {

	private String city;
	private  int doorno;
	private int pin;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getDoorno() {
		return doorno;
	}
	public void setDoorno(int doorno) {
		this.doorno = doorno;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", doorno=" + doorno + ", pin=" + pin + "]";
	}
}
