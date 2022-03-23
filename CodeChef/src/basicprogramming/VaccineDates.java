package basicprogramming;
import java.util.*;
public class VaccineDates {
	public static void main(String[] args) {	
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	for(int i=0;i<t;i++)
	{
		int d=sc.nextInt();
		int l=sc.nextInt();
		int r=sc.nextInt();
		if(d>=l && d<=r)
		{
			System.out.println("Take second dose now");
		}
		else if(d>l)
		{
			System.out.println("Too late");
		}
		else if(d<r)
		{
			System.out.println("Too early");
		}
	}
}
}
