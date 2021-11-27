package olympics;

import java.util.ArrayList;

public class TeamCategory extends OlympicsTeams {

	private ArrayList<OlympicsTeams> teams = new ArrayList<OlympicsTeams>();
	
	public TeamCategory(String name, int numberOfAthletes, int numberOfGoldMedals) {
		this.name = name;
		this.numberOfAthletes = numberOfAthletes;
		this.numberOfGoldMedals = numberOfGoldMedals;
	}
	
	@Override
	public void print(boolean showGoldMedals) {
		for(OlympicsTeams o : teams) {
			o.print(showGoldMedals);
		}
	}

	public void addTeam(OlympicsTeams o) {
		teams.add(o);
	}
	
	public void removeTeam(OlympicsTeams o) {
		teams.remove(o);
	}
	
	public OlympicsTeams getTeam(int index) {
		return teams.get(index);
	}
}
