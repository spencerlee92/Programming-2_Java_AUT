
public class CustomerAccountTester {

	public static void main(String[] args) {
		try{
		CustomerAccount c1 = 
				new CustomerAccount("Herr Mustermann");
		System.out.println(c1);
		
			c1.setName(null);
		}catch(CustomerAccountNameCannotBeEmpty e){
			System.err.println("CustomerAccountNameCannotBeEmpty caught!");
		}
		
	}

}
