import java.util.ArrayList;
import java.util.Scanner;

public class Ac_1107 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String n = in.nextLine();
		int m = in.nextInt();
		ArrayList<Integer> arr  = new ArrayList<>();
		int check[] = new int[10];
		int cnt=0;
		int findsmall=0, findbig=0;
		int c=0;
		int temp=0;
		for(int i=0; i<m; i++)
		{
			check[in.nextInt()] = 1;
		}
		
	/*	for(int i=0; i<check.length; i++)
		{
			System.out.println(check[i]);
		}*/
			
		if( m == 0)
		{
			if( Integer.parseInt(n) == 100)
				cnt=0;
			else
			cnt = n.length();
		}		
		else //m > 0
		{
			//findsmall
			for(int i=Integer.parseInt(n)-1; i>=0; i--)
			{
				for(int j=0; j<Integer.toString(i).length(); j++)
				{
					if(check[Integer.parseInt(""+Integer.toString(i).charAt(j))] == 1)
						break;
					else 
						findsmall = i;
				}
			}
			//findbig
			for(int i=Integer.parseInt(n)+1; i<=1000000; i++)
			{
				for(int j=0; j<Integer.toString(i).length(); j++)
				{
					if(check[Integer.parseInt(""+Integer.toString(i).charAt(j))] == 1)
						break;
					else 
						findsmall = i;
				}
			}
			
			c = ( Math.abs(Integer.parseInt(n)-findsmall) > Math.abs(Integer.parseInt(n)-findbig))?findbig:findsmall;
			System.out.println(c);
			
		}
		
		System.out.println(cnt);

	}

}
