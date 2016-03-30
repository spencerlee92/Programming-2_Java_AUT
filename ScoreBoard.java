public class ScoreBoard {
	public static final int MAX_SCORES = 5;
	private Score[] scores;

	public ScoreBoard() {
		this.scores = new Score[MAX_SCORES];
	}

	public void update(int index, Score score) {
		if ((index >= 0) && (index < scores.length)) {
			scores[index] = score;
		}
	}

	public Score read(int index) {
		if (!((index >= 0) && (index < scores.length))) {
			return null;
		}
		return scores[index];
	}

	public boolean add(Score score) {
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] == null) {
				scores[i] = score;
				return true;
			}
		}
		return false;
	}

	public void remove(int index) {
		update(index, null);
	}

	public String toString() {
		String scoreString = "";
		for (int i = 0; i < scores.length; i++) {

			if (scores[i] != null) {
				scoreString += scores[i] + "\n";
			}

		}
		return scoreString;
	}

	public Score findScore(int score) {
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] != null && scores[i].getScore() == score) {
				return scores[i];
			}
		}
		return null;
	}

	public Score highScore() {
		int max = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] != null && scores[i].getScore() > max) {
				max = scores[i].getScore();
			}
		}
		return findScore(max);
	}
}
