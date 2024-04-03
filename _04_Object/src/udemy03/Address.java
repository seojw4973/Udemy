package udemy03;

public class Address {
	private String line1;
	private String city;
	private String zip;
		
	//생성
	public Address(String line1, String city, String zip) {
		super();
		this.line1 = line1;
		this.city = city;
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Address [line1=" + line1 + ", city=" + city + ", zip=" + zip + "]";
	}
	
	
	
	
}
