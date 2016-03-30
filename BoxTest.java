
public class BoxTest {

public static void main(String args[]){
		
		Box<Integer> a = new Box<Integer>(2);
		Box<Integer> b = new Box<Integer>(4);
		
		System.out.println(a.getContents()+b.getContents());
		
		Box<Double> c = new Box<Double>(3.14);
		Box<String> d = new Box<String>("hello");
		Box<Box<Integer>> e = new Box<Box<Integer>>(new Box<Integer>(new Integer(100)));
		
		System.out.println(a.getContents()+e.getContents().getContents());
		
		
	}
}
