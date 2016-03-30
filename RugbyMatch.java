public class RugbyMatch {
	private RugbyScore home;
	private RugbyScore opposition;
	private boolean matchFinished;

	public RugbyMatch(RugbyScore home, RugbyScore opposition) {
		this.home = home;
		this.opposition = opposition;
		matchFinished = false;

	}

	public void finishMatch() {
		matchFinished = true;
	}

	public int homeScore(ScoreAction sa) {
		return home.score(sa);

	}

	public int opposition(ScoreAction sa) {
		return opposition.score(sa);
	}

	public RugbyScore winner() {
		if (home.getPoints() > opposition.getPoints()) {
			return home;
		}
		return opposition;
	}

	public String toString() {
		if (home.getPoints() > opposition.getPoints()) {

			if (!matchFinished)
				return home.getName() + " leading the " + opposition.getName()
						+ home.getPoints() + "-" + opposition.getPoints()
						+ "/n";
			else
				return home.getName() + " won over " + opposition.getName()
						+ home.getPoints() + "-" + opposition.getPoints()
						+ "/n";

		} else if (home.getPoints() < opposition.getPoints()) {
			if (!matchFinished)
				return opposition.getName() + " leading the " + home.getName()
						+ opposition.getPoints() + "-" + home.getPoints()
						+ "/n";
			else
				return opposition.getName() + " won over " + home.getName()
						+ opposition.getPoints() + "-" + home.getPoints()
						+ "/n";
		}
		return home.getName() + " tied with the  " + opposition.getName()
				+ home.getPoints();
	}
}
