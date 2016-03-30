import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayListTest {
	static Scanner keyboard = new Scanner(System.in);

	static void method(ArrayList<Integer> a) {
		boolean zero = true;
		int i = 0;
		while (zero) {
			//keyboard.nextLine();
			try {
				
				System.out.println("Please input a number:");
				
				a.add(keyboard.nextInt());
				if (a.get(i) != 0) {
					i++;
					System.out.println("Please input another number:");
					a.add(keyboard.nextInt());
					if (a.get(i) != 0) {
						i++;
					} else {
						zero = false;
					}
				} else {
					zero = false;
				}

			} catch (InputMismatchException e) {
				System.err.println("That's not a integer please input again.");
				keyboard.nextLine();
			}
		}

	}

	public static void main(String[] args) {
		ArrayList<Integer> myArray = new ArrayList<Integer>();
		method(myArray);
		System.out.println();
		
		System.out.println(myArray.size());
		
		System.out.println();

		for (int i = 0; i < myArray.size(); i++) {
			System.out.println(myArray.get(i));
		}
		
		System.out.println();
		
		if (myArray.size()>2)
			System.out.println(myArray.get(2));
		else
			System.out.println("The index is empty");

		System.out.println();
		
		myArray.add(10);
		

		for (int j = 0; j < 4; j++) {
			if(myArray.size() > 3)
				myArray.remove(3);
		}
		System.out.println("Remove");
		for (int i = 0; i < myArray.size(); i++) {
			System.out.println(myArray.get(i));
		}
		
		int sum = 0;
		for (int i = 0; i < myArray.size(); i++) {
			sum += (Integer) myArray.get(i);
		}
		System.out.println(sum);

	}

}
