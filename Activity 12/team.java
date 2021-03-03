import java.util.ArrayList;

public class Team {
	private String name;

	ArrayList<Player> playerList = new ArrayList<Player>();
	
	

	public Team() {
		super();
	}

	public Team(String name, ArrayList<Player> playerList) {
		super();
		this.name = name;
		this.playerList = playerList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Player> getPlayerList() {
		return playerList;
	}

	public void setPlayerList(ArrayList<Player> playerList) {
		this.playerList = playerList;
	}
	public void addPlayerToTeam(Player player) {
		playerList.add(player);
	}
	
	public Boolean removePlayerFromTeam(String name) {
		
		if(playerList.contains(name)) {
			
			
		playerList.remove(name);
		return true;
		}
		else 
		return false;
		
	}
	
	public void displayPlayers() {
		
		if(playerList.contains(name)) {
			System.out.println(playerList);
		
	}
	
}}
