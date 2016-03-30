import java.util.Scanner;


public class ShapeTester {

	public static void main(String[] args) {
		Shape[] shape = new Shape[5];
		

		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("What kind of shape do you want");
			int choice = Integer.parseInt(scanner.nextLine());
			
			
			if(choice == 0)
				shape[i] = new Rectangle();

			shape[i].promptUserForDetails();
			
			
		}
		
		
		
		
		
		System.out.println("Area is "+shape[0].computeArea());
	}

}
