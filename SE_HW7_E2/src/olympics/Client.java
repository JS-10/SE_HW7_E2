package olympics;

public class Client {

	public static void main(String[] args) {
		// Task 2
		TeamCategory allTeams = new TeamCategory("All Teams of the Olympic Games 2024", 10248, 378);
		
		TeamCategory asia = new TeamCategory("Asia Team", 357, 192);
		TeamCategory europe = new TeamCategory("Europe Team", 296, 157);
		allTeams.addTeam(asia);
		allTeams.addTeam(europe);
		
		TeamCategory china = new TeamCategory("China Team", 261, 78);
		Team afghanistan = new Team("Afghanistan Team", 58, 4);
		asia.addTeam(china);
		asia.addTeam(afghanistan);
		
		TeamCategory germany = new TeamCategory("Germany Team", 154, 34);
		europe.addTeam(germany);
		
		TeamCategory chinaWomen = new TeamCategory("China Women's Team", 98, 43);
		TeamCategory chinaMen = new TeamCategory("China Men's Team", 163, 35);
		china.addTeam(chinaWomen);
		china.addTeam(chinaMen);
		
		TeamCategory germanyWomen = new TeamCategory("Germany Women's Team", 65, 15);
		TeamCategory germanyMen = new TeamCategory("Germany Men's Team", 89, 19);
		germany.addTeam(germanyWomen);
		germany.addTeam(germanyMen);
		
		Team taekwondo = new Team("China Women's Taekwondo Team", 21, 13);
		Team waterpolo = new Team("China Women's Waterpolo Team", 12, 5);
		Team artisticGymnastics = new Team("China Women's Artistic Gymnastics Team", 37, 20);
		chinaWomen.addTeam(taekwondo);
		chinaWomen.addTeam(waterpolo);
		chinaWomen.addTeam(artisticGymnastics);
		
		Team shooting = new Team("China Men's Shooting Team", 26, 9);
		chinaMen.addTeam(shooting);
		
		Team cycling = new Team("Germany Women's Cycling Team", 24, 4);
		Team tennis = new Team("Germany Women's Tennis Team", 11, 5);
		germanyWomen.addTeam(cycling);
		germanyWomen.addTeam(tennis);
		
		Team tableTennis = new Team("Germany Men's Table Tennis Team", 13, 10);
		Team football = new Team("Germany Men's Football Team", 23, 1);
		germanyMen.addTeam(tableTennis);
		germanyMen.addTeam(football);
		
		// Task 3
		// a) Name of the Teams and Number of Athletes of Germany Men’s Team
		System.out.println("a) Name of the Teams and Number of Athletes of Germany Men’s Team:");
		System.out.println("--------------------------------------------------------");
		germanyMen.print(false);
		System.out.println("--------------------------------------------------------");
		System.out.println();
		
		// b) Name of the Teams and Number of Gold medals of Germany
		System.out.println("b) Name of the Teams and Number of Gold medals of Germany:");
		System.out.println("--------------------------------------------------------");
		germany.print(true);
		System.out.println("--------------------------------------------------------");
		System.out.println();
		
		// c) Name of the Teams and Number of Gold medals of Asia’s Team
		System.out.println("c) Name of the Teams and Number of Gold medals of Asia’s Team:");
		System.out.println("--------------------------------------------------------");
		asia.print(true);
		System.out.println("--------------------------------------------------------");
		System.out.println();
		
		// d) Name and Number of athletes of teams in Olympic 2024
		System.out.println("d) Name and Number of athletes of teams in Olympic 2024:");
		System.out.println("--------------------------------------------------------");
		allTeams.print(false);
		System.out.println("--------------------------------------------------------");
	}

}
