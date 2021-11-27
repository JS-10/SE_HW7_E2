package olympics;

public abstract class OlympicsTeams {
	
	public String name;
	public int numberOfAthletes;
	public int numberOfGoldMedals;
	
	public abstract void print(boolean showGoldMedals);
}
