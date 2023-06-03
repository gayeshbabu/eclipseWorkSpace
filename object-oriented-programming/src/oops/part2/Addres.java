package oops.part2;

public class Addres {
	
//	state
	
	private String line1;
	private String city;
	private String zip;
	
	
	
//	creation
	
	public Addres(String line1, String city, String zip) {
		super();
		this.line1 = line1;
		this.city = city;
		this.zip = zip;
	}
 public String toString() {
	 return line1 + " " + city +" "+ zip;
 }
	
//	String.format("line1 -[%s],city -[%s],zip-[%s]",line1,city,zip);
}
