package customer;

public class Address {
	private String city;
	private String street;
	private String zip;

	public Address(String city, String street, String zip) {
		super();
		this.city = city;
		this.street = street;
		this.zip = zip;

	}

	public String toString() {
		return  city + " " + street + " " + zip;

	}
}
