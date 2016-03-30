import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AlgorithmTest {
	static Scanner keyboard = new Scanner(System.in);
	static ArrayList<Integer> integerInput(int n ){
		
		ArrayList<Integer> a = new ArrayList<Integer>(); 
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
		return a;
	}
	
	
	static int getMax(ArrayList<Integer> myArray){
		int MAX_VALUE = 0;
		for(int i = 0; i < myArray.size();i++){
			if(myArray.get(i)>MAX_VALUE){
				MAX_VALUE = myArray.get(i);
			}
		}
		return MAX_VALUE;
	}
	
	
	
	public static void main(String[] args) {
		
	}

}
