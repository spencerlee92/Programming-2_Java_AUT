
public class CustomerAccount {
	private String name ;
	
	public CustomerAccount(String name) throws CustomerAccountNameCannotBeEmpty
	{
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name !=null && name !=""){
		this.name = name;
		}else{
			throw new CustomerAccountNameCannotBeEmpty();
		}
	}
	public String toString(){
		return "This customer's name is "+this.getName();
	}
}
