
public class Dog extends Animal{
	
	public Dog() {
		super();
	}
	
	public void makeNoise() {
		System.out.println("The dog says woof!");
	}
	public void eat() {
		this.setEat(20);
		System.out.println("The dog eats "+this.getEat()+"kj of food");
	}

	public void sleep() {
		this.setSleep(2000);
		System.out.println("The dog sleeps for "+this.getSleep()+"ms");
		try {
			Thread.sleep(getSleep());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
