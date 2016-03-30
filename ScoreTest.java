public class ScoreTest {
	public static void main(String[] args) {
		Score s1 = new Score("ken", 910);
		Score s2 = new Score("steffen", 1910);

		System.out.println(s1);
		System.out.println(s2);
		
		ScoreBoard sb = new ScoreBoard();
		
		//sb.update(0, s1);
		//sb.update(3, s2);
		//System.out.println(sb.read(2));
		
		sb.add(s1);
		sb.add(s2);
		System.out.println(sb.read(1));
		System.out.println(sb.read(2));
		System.out.println(sb.read(3));
		System.out.println(sb.read(4));
		System.out.println(sb.read(0));
		System.out.println("SCOREBOARD IS \n\n");
		System.out.println(sb);
		System.out.println("FIND SCORE 910: \n\n");
		System.out.println(sb.findScore(91));
		System.out.println("HIGH SCORE : \n\n");
		System.out.println(sb.highScore());
	}
}
