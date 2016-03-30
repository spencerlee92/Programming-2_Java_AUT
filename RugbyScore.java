public class RugbyScore {
	private String name;
	private int points;

	public RugbyScore(String name) {
		this.name = name;
		this.points = 0;
	}

	public int score(ScoreAction sa) {
		return this.points += sa.getPoints();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public String toString() {
		return this.name + " number of the points: " + points;
	}
}
