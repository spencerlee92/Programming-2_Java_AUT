public class Score {
	private String name;
	private int score;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getScore() {
		return this.score;
	}

	public Score(String name, int score) {
		this.setName(name);
		this.setScore(score);
	}

	public String toString() {
		return this.getName() + "'s score : " + this.getScore();
	}

}
