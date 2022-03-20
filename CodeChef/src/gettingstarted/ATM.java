package gettingstarted;
import java.util.*;
public class ATM {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		float blnc=sc.nextFloat();
		float chrg=0.50f;
		if(x%5==0 && blnc>=x+chrg)  
		{
			blnc=blnc-(chrg+x);
			System.out.println(blnc);
		}
		else
		{
		System.out.println(blnc);
		}
	}

}
