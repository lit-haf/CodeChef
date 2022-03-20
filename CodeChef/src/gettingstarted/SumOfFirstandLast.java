package gettingstarted;
import java.util.*;
public class SumOfFirstandLast {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int sum=0;
		for(int i=0;i<t;i++)
		{
			int count=0;
			int n=sc.nextInt();
			int last=n%10;
			int temp=n;
			while(temp>0)
			{
				temp=temp/10;
				count++;
			}
			int divisor=(int) Math.pow(10, count-1);
			int first=n/divisor;
			sum=first+last;
			System.out.println(sum);
		}
		
	}

}
