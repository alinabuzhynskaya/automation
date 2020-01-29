package customer;

public class Customer {

	// state
	private String name;

	public String getName() {
		return name;
	}

	// creating
	public Customer(String name, Address homeAddress) {
		this.name = name;
		this.homeAddress = homeAddress;
	}

	// operations

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getWorkAddress() {
		return workAddress;
	}

	public void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}

	private Address homeAddress;
	private Address workAddress;

	public String toString() {
		return String.format("name -[%s] home address - [%s] work address[%s]", name, homeAddress, workAddress);
	}
	
	

}
