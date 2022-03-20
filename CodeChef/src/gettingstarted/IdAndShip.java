package gettingstarted;
import java.util.*;
public class IdAndShip {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			char c=sc.next().charAt(0);
			if(c=='b' || c=='B')
			{
				System.out.println("BattleShip");
			}
			else if(c=='c' || c=='C')
			{
				System.out.println("Cruiser");
			}
			else if(c=='d' || c=='D')
			{
				System.out.println("Destroyer");
			}
			else if(c=='f' || c=='F')
			{
				System.out.println("	Frigate");
			}
			
    	}
	}
}
