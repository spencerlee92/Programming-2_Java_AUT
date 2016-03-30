
public class Sheep extends Animal{
	public Sheep() {
		super();
	}
	public void makeNoise() {
		System.out.println("The sheep says baaa!");
	}
	public void eat() {
		this.setEat(30);
		System.out.println("The shheep eats "+this.getEat()+"kj of food");
	}

	public void sleep() {
		this.setSleep(4000);
		System.out.println("The sheep sleeps for "+this.getSleep()+"ms");
		try {
			Thread.sleep(getSleep());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
