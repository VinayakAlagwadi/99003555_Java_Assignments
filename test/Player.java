import java.text.DateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Player implements Comparable<Player> {
	
	private String name;
	private LocalDate dateOfBirth;
	private String skill;
	private int numberOfMatches;
	private int runs;
	private int wickets;
	private String nationality;
	private double powerRating;
	
	public Player() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	
	public Player(String name, Date dateOfBirth, String skill, int numberOfMatches, int runs, int wickets,
			String nationality, double powerRating) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.skill = skill;
		this.numberOfMatches = numberOfMatches;
		this.runs = runs;
		this.wickets = wickets;
		this.nationality = nationality;
		this.powerRating = powerRating;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public int getNumberOfMatches() {
		return numberOfMatches;
	}
	public void setNumberOfMatches(int numberOfMatches) {
		this.numberOfMatches = numberOfMatches;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public double getPowerRating() {
		return powerRating;
	}
	public void setPowerRating(double powerRating) {
		this.powerRating = powerRating;
	}
	
	
	public static Player createPlayer(String detail){
		
	
		String ar[] = detail.split("\\,");
		
		Player p1 = new Player();
		String s = ar[1];
		
		LocalDate d1= LocalDate.parse(s);
		
		p1.setName(ar[0]);
		p1.setDateOfBirth(d1);
		p1.setSkill(ar[2]);
		p1.setNumberOfMatches(ar[3]);
		
		
		
		ArrayList <Player> a1 = new ArrayList<Player>();
		
		//for(int i=0;i<ar.length;i++){
			a1.add(new Player(ar[i],));
		//}
		
		
		return new Player()
			
			
		}
		
		
		
		return null;
		
	}








	@Override
	public int compareTo(Player o) {
		// TODO Auto-generated method stub
		
		return numberOfMatches.compareTo(o.getNumberOfMatches());
	}
	
	
	
	
	

}
