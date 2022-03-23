package basicprogramming;
import java.util.*;
public class Motivation {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("t");
		int t=sc.nextInt();
		for(int i=1;i<=t;i++)
		{
			int n=sc.nextInt();
			int x=sc.nextInt();
			int s[]=new int[n];
			int r[]=new int[n];
			int max=0;
			for(int j=0;j<n;j++)
			{
				s[j]=sc.nextInt();
				r[j]=sc.nextInt();
				if(s[j]<=x && r[j]>=max)
				{
					max=r[j];
				}
			}
			System.out.println(max);
		}
		sc.close();
	}

}
