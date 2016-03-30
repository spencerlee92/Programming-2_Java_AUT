
public class Shape {
	
	public static int counts;
	public double area;
	public double perimiter;
	
	public double computeArea(){
		return area;
	}
	
	public double computePerimiter(){
		return perimiter;
	}
	public void promptUserForDetails(){
		
	}
	
	public Shape(){
		System.out.println("Allocating a new Shape...");
		counts++;
		System.out.println(counts + " have been created.");
		area = 0;
		perimiter = 0;
		
	}
}
