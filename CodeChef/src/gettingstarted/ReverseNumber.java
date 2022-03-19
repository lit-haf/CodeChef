package gettingstarted;
import java.util.*;
public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int rem=0;
		int rev=0;
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			while(n>0)
			{
				rem=n%10;
				rev=rev*10+rem;
				n=n/10;
			}
			System.out.println(rev);
			rev=0;
		}

	}

}
