package basicprogramming;
import java.util.*;
public class TurnIt {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int u = sc.nextInt();
	        int v = sc.nextInt();
	        int a = sc.nextInt();
	        int s = sc.nextInt();
	        
	        int value = ((u*u)-(2*a*s));
	        if(value<=(v*v)){
	            System.out.println("YES");
	        }else{
	            System.out.println("NO");
	        }
		}

	}

}
