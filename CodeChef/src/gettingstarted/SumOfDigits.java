package gettingstarted;
import java.util.*;
public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t =sc.nextInt();
		int sum=0;
		int temp=0;
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			while(n>0)
			{
			temp=n%10;
			sum=sum+temp;
			n=n/10;	
			
			}
			System.out.println(sum);
			sum=0;
	        }
	}
}


