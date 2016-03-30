public class Exercise2 {
	static boolean CAUSE_EXCEPTION = true;

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			try {
				System.out.println("Try block executed: ");
				if (CAUSE_EXCEPTION)
					throw new Exception(i+"");
				System.out.println("End of the try block!");

			} catch (Exception e) {
				System.err.println(e +". execption caught!");
			} //finally {
				//System.out.println("Finally Block is executed");
			//}
		}

	}
}
