package gettingstarted;
import java.util.*;
public class LuckyFour {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int count=0;
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			while(n!=0)
			{
				int temp=n%10;
				if(temp==4)
				{
					count++;
				}
				n=n/10;
			}
			System.out.println(count);
			count=0;
		}

	}

}
