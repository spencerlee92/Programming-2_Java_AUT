public class ScoreTable {
	public static final int MAX_PLAY = 3;
	public static final int MAX_SCORE = 4;
	private Score[][] scoreTable;
	public ScoreTable(){
		this.scoreTable = new Score[MAX_PLAY][MAX_SCORE];
	}
	public void update(int row, int column, Score aScore){
		scoreTable[row][column] = aScore;
	}
}
