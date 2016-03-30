
public class Box<T> {
	private T contents;

	public T getContents() {
		return contents;
	}

	public void setContents(T contents) {
		this.contents = contents;
	}
	
	public String toString(){
		return this.contents.toString();
	}
	
	public Box(T contents){
		this.setContents(contents);
	}
}
