public class SimpleDateTestProgram {
	public static void main(String args[]) {
		SimpleDate d1 = new SimpleDate();
		d1.setDay(21);
		d1.setMonth(3);
		d1.setYear(2015);
		System.out.println(d1);
		SimpleDate d2 = new SimpleDate(22, 03, 2015);
		System.out.println(d2);
		System.out.println(d2.isSameDate(d1));
		System.out.println("Is "+ d1 + " before "+ d2 + " ? "+d1.isBefore(d2));
		System.out.println("Is "+ d1 + " after "+ d2 + " ? "+d1.isAfter(d2));
	}
}
