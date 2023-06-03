package oops.part2;

public class Customer {
//	state
	private String name;
	private Addres homeAddres;
	private Addres workAddres;

//	creating
	
	public Customer(String name, Addres homeAddres) {
		this.name=name;
		this.homeAddres=homeAddres;
	}
	//operations

	public Addres getHomeAddres() {
		return homeAddres;
	}

	public void setHomeAddres(Addres homeAddres) {
		this.homeAddres = homeAddres;
	}

	public Addres getWorkAddres() {
		return workAddres;
	}

	public void setWorkAddres(Addres workAddres) {
		this.workAddres = workAddres;
	}
 public String toString() {
	 return String.format("name-[%s], homeAddres-[%s], workAddres-[%s]", name,homeAddres,workAddres);
 }

}
	
	
	

