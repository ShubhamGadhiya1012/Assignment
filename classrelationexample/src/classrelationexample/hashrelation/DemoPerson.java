package classrelationexample.hashrelation;

public class DemoPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address add = new Address();
		add.setFlatno("104");
		add.setSocityname("Riddhi Siddhi");
		add.setArea("Ahmedabad");
		add.setPincode(123);
		
		
		Person ps = new Person();
		ps.setAddr(add);
		ps.setPemail("gadhiyashubham@gmail.com");
		ps.setPname("Shubham");
	// injection object of address class to person class 
	
	}
	

}
