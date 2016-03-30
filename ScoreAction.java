
public enum ScoreAction {
	TRY(5),CONVERSIONKICK(2),PENALITYKICK(3),DROPGOAL(3);
	private int points;
	
	private ScoreAction(int points){
		this.points = points;
	}
	
	public int getPoints(){
		return this.points;
	}
}
