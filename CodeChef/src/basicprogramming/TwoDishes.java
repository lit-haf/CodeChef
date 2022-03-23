package basicprogramming;
import java.util.*;
public class TwoDishes {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			if(a+c>=n && b>=n)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}
	}
}
