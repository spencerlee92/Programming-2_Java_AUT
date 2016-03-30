public class Cat extends Animal {
	public Cat() {
		super();
	}

	public void makeNoise() {
		System.out.println("The cat says meow!");
	}

	public void eat() {
		this.setEat(50);
		System.out.println("The cat eats " + this.getEat() + "kj of food");
	}

	public void sleep() {
		this.setSleep(9000);

		System.out.println("The cat sleeps for " + this.getSleep() + "ms");

		try {
			Thread.sleep(getSleep());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}