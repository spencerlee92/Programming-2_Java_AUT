public class Animal {
	private int sleep;
	public int getSleep() {
		return sleep;
	}

	public void setSleep(int sleep) {
		this.sleep = sleep;
	}

	public int getEat() {
		return eat;
	}

	public void setEat(int eat) {
		this.eat = eat;
	}

	private int eat;

	public void eat() {
		this.setEat(0);
		System.out.println("The animal eats "+this.getEat()+"kj of food");
	}

	public void sleep() {
		this.setSleep(0);
		System.out.println("The animal sleeps for "+this.getSleep()+"ms");
		try {
			Thread.sleep(getSleep());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void makeNoise() {
		System.out.println("The animal makes noise!");
	}

	public Animal() {
		makeNoise();
	}
}
