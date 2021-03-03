import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Player {
	
	private String name;
	private Date dateOfBirth;
	private String skill;
	private int numberOfMatches;
	private int runs;
	private int wickets;
	private String nationality;
	private double powerRating;
	
	
	
	
	public Player() {
		super();
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
	public Player(String name2, String  dateOfBirth2, String skill2, String  numberOfMatches2, String  runs2, String  wickets2,
			String nationality2, String powerRating2) throws ParseException {
		super();
		this.name = name2;
		SimpleDateFormat formatter1=new SimpleDateFormat("dd-mm-yyyy");
		Date date1=formatter1.parse(dateOfBirth2);
		this.dateOfBirth = date1;
		this.skill = skill2;
		this.numberOfMatches = Integer.parseInt(numberOfMatches2);
		this.runs = Integer.parseInt(runs2);
		this.wickets = Integer.parseInt(wickets2);
		this.nationality = nationality;
		this.powerRating = Double.parseDouble(powerRating2);
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
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
	
	public Player createPlayer(String detail) throws ParseException {
		
		String []arr = detail.split("\\,");
		Player p1 = new Player(arr[0],arr[1],arr[2],arr[3],arr[4],arr[5],arr[6],arr[7]);
		return p1;	
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", dateOfBirth=" + dateOfBirth + ", skill=" + skill + ", numberOfMatches="
				+ numberOfMatches + ", runs=" + runs + ", wickets=" + wickets + ", nationality=" + nationality
				+ ", powerRating=" + powerRating + "]";
	}
	
}
