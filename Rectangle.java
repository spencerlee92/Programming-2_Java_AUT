import java.util.Scanner;


public class Rectangle extends Shape
{
	private double length;
	private double width;
	
	public Rectangle()
	{
		super();
	}
	
	public void promptUserForDetails()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter width ");
		width = Double.parseDouble(scanner.nextLine());
		System.out.println("Enter height ");
		length = Double.parseDouble(scanner.nextLine());
	}
	
	public double computeArea()
	{
		area = width * length;
		return area;
	}
	
}
