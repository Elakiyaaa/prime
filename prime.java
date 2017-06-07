package interval;

import java.util.Scanner;

public class prime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int flag=0;
		for(int i=2;i<a;i++){
			if(a%i==0)
		flag=2;
		}
			if(flag==2)
				System.out.print("NOT A PRIME NUMBER");
			else
				System.out.print("PRIME NUMBER");
			s.close();	
	}
	
}

	


