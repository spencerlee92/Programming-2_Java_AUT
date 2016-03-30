import java.util.Scanner;

public class AnimalTest {
	public static void main(String args[]) {
		Animal[] a = new Animal[4];
		a[0] = new Cat();
		a[1] = new Dog();
		a[2] = new Sheep();
		a[3] = new Cow();

		System.out
				.println("Welcome to animal world! Please choose an animal to raise:\n"
						+ "1.Cat\n2.Dog\n3.Sheep\n4.Cow");
		Scanner keyboard = new Scanner(System.in);
		int choice = keyboard.nextInt();
		keyboard.nextLine();


		boolean b = true;
		while (b) {
			String s ="";
			System.out.println("Do you want to feed this animal or let it sleep?(feed/sleep/quit)");
			s = keyboard.nextLine();

			if (s.equalsIgnoreCase("feed")) {
				a[choice - 1].eat();

			} else if (s.equalsIgnoreCase("sleep")) {
				a[choice - 1].sleep();

			} else if (s.equalsIgnoreCase("quit")) {
				b = false;
			} else {
				System.out.println("You should input the correct words!");
			}
		}
	}
}