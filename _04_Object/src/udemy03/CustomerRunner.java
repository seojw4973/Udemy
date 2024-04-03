package udemy03;

public class CustomerRunner {
	public static void main(String[] args) {
		
		Address homeAddress = new Address("line 1", "seoul", "08135");
		Customer customer = new Customer("juwon", homeAddress);
		
		Address workAddress = new Address("line 1 for work", "seoul", "53180");
		customer.setWorkAddress(workAddress);
		
		System.out.println(customer);
	}

}
