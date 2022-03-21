package BasicProgramming;
import java.util.*;

public class TwoDishes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			int s=sc.nextInt();
			if(n>=s)
			{
			System.out.println(s);	
			}
			else
			{
				System.out.println(2*n-s);
			}
		}

	}

}
