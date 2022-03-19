package gettingstarted;
import java.util.*;
public class EnormousInput {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int r=0;
		for(int i=0; i< n; i++)
		{
			int t=sc.nextInt();
			if(t%k==0)
			{
				r++;
			}
		}
		System.out.println(r);
		sc.close();
	}
}