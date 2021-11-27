package olympics;

public class Team extends OlympicsTeams {

	public Team(String name, int numberOfAthletes, int numberOfGoldMedals) {
		this.name = name;
		this.numberOfAthletes = numberOfAthletes;
		this.numberOfGoldMedals = numberOfGoldMedals;
	}
	
	@Override
	public void print(boolean showGoldMedals) {
		if(showGoldMedals) {
			System.out.println(name + ", Number of Gold medals: " + numberOfGoldMedals);
		}else if(!showGoldMedals){
			System.out.println(name + ", Number of Athletes: " + numberOfAthletes);
		}
	}

}
