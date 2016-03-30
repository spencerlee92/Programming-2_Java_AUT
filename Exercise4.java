import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise4 {
	private static Scanner scanner;

	public static void product() {
		try{
		System.out.println("Enter number 1:");
		int value1 = scanner.nextInt();
		System.out.println("Enter number 2:");
		int value2 = scanner.nextInt();
		System.out.println("Product is: " + (value1 * value2));
		}catch(InputMismatchException e){
				System.err.println("Error reading interger value "+e);
				scanner.next();
		}
	}

	public static void main(String args[]) {
		scanner = new Scanner(System.in);
		boolean a = true;
		System.out.println("Welcome to the calculator.");

		while (a) {
			System.out.println("1. Computer product\n2. quit");
			int b = scanner.nextInt();
			if (b == 1) {
				product();
			} else if (b == 2) {
				a = false;
			}else{
				System.err.println("\nInvalid menu input. Please try again.");
			}
		}
	}
}