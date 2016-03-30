import java.util.ArrayList;

public class BinaryTree<T extends Comparable<T>> {
	private T data;
	private BinaryTree<T> left;
	private BinaryTree<T> right;

	public BinaryTree(T element) {
		this.setData(element);
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String toString() {
		
		String s = this.getData()+"(";
		if(left!= null)
			s+=left.toString();
		s+=" , ";
		if(right!= null)
			s+=right.toString();
		s+=")";
		return s;
	}

	public BinaryTree<T> insert(T element) {
		if (element.compareTo(this.data) == 0)
			return this;
		if (element.compareTo(this.data) < 0) {
			if (this.left == null) {
				this.left = new BinaryTree<T>(element);
				return this.left;
			}
			return this.left.insert(element);
		}
		if (this.right == null) {
			this.right = new BinaryTree<T>(element);
		}
		return this.right.insert(element);

	}
	
	public BinaryTree<T>search(T element){
		if(element.compareTo(this.data)==0)
			return this;
		if(element.compareTo(this.data)<0)
			if(this.left==null)
				return null;
			else
				return this.left.search(element);
		if(this.right == null)
			return null;
		else
			return this.right.search(element);
	}
	
	public void insetAll(ArrayList<T> array){
		for(int i = 0; i< array.size();i++){
			T element = array.get(i);
			insert(element);
			
		}
			
	}
	
	public static void main(String args[]){
		BinaryTree<Integer> b1 = new BinaryTree<Integer>(2);
		b1.insert(4);
		b1.insert(3);
		b1.insert(6);
		b1.insert(1);
		b1.insert(0);
		b1.insert(5);
		
		System.out.println(b1);
		BinaryTree<String> b2 = new BinaryTree<String>("Asi");
		b2.insert("Bob");
		b2.insert("Alice");
		b2.insert("Carl");
		System.out.println(b2);
		
		
		BinaryTree<Integer> b3 = new BinaryTree<Integer>(5);
		b3.insert(10);
		b3.insert(2);
		b3.insert(4);
		b3.search(4);
		b3.search(10);
		b3.search(6);
	}


}
