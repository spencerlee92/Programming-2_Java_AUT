
public class Cow extends Animal{
	public Cow() {
		super();
	}
	public void makeNoise() {
		System.out.println("The cow says mooo!");
	}
	public void eat() {
		this.setEat(10);
		System.out.println("The cow eats "+this.getEat()+"kj of food");
	}

	public void sleep() {
		this.setSleep(6000);
		System.out.println("The cow  sleeps for "+this.getSleep()+"ms");
		try {
			Thread.sleep(getSleep());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
