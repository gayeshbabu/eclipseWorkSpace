package oops.part2;

public class CustomerRunner {

	public static void main(String[] args) {
		
		Addres homeAddres = new Addres("line1","hyderabad","52002");
		Customer customer = new Customer("gayesh", homeAddres);
//		System.out.println(customer);
		
		Addres workAddres = new Addres("line1","inka emi ledhu ","52002");
		customer.setWorkAddres(workAddres);
		System.out.println(homeAddres);
		System.out.println(customer);
		
	}
 
 }

