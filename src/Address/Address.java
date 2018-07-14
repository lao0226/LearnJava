package Address;

public class Address {

	//instance variable
	private int houseNumber;
	private String street;
	private int apartNumber;
	private String city;
	private String state;
	private int postalCode;
	
	//constructor
	public Address(int houseNumber,String street,int apartNumber, String city, String state, int postalCode) {
		this.houseNumber=houseNumber;
		this.street=street;
		this.apartNumber=apartNumber;
		this.city=city;
		this.state=state;
		this.postalCode=postalCode;
	}
	
	public Address(int houseNumber, String street, int apartNumber, String city, String state) {
		this.houseNumber=houseNumber;
		this.street=street;
		this.apartNumber=apartNumber;
		this.city=city;
		this.state=state;
	}
	
	
	//method
	
	public String returnAddress3line() {
		String line1="Apartment Number: "+apartNumber+"; House Number: "+houseNumber;
		String line2="Street: "+street;
		String line3="City: "+city+"; State: "+state+"; Postal Code: "+postalCode;
		return line1+"\n"+line2+"\n"+line3;
	}
	
	public boolean comesBefore(Address address) {
		if(this.postalCode>address.postalCode) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
