import java.text.ParseException;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) throws ParseException {
		
		Player p1=new Player();
		Team t1=new Team();
	    Scanner s=new Scanner(System.in);
	 	System.out.println("Enter the name of the Team:");
		String str=s.next();
		System.out.println("1.Add Player\n 2.Delete Player\n3.Display Players\n4.Exit\n");
		int n=s.nextInt();
		if(n==1)
		{
        System.out.println("Enter the player details");	
		p1.createPlayer(s.next());
		
		t1.addPlayerToTeam(p1);
		}
		else if(n==2)
		{System.out.println("Enter the player name");	
		t1.removePlayerFromTeam(s.next());	
		}
		else if(n==3)
		{
	     t1.displayPlayers();		
		}
		
	}

}
