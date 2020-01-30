package customer;

public class CustomerRunner {

	public static void main(String[] args) {
		Address homeAddress = new Address("Minsk", "Skaryny", "220085");
		Customer customer = new Customer("Alina", homeAddress);
		Address workAddress = new Address("Minsk", "Kazintsa", "220088");
		customer.setWorkAddress(workAddress);
		System.out.println(customer);
	}

}
