import java.util.*;

public class Ac_2443 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n,flag,temp,total;
		
		n = in.nextInt();
		flag =0;
		temp =0;
		total = 2* n - 1;
		
		for(int i=0; i<n; i++)
		{
			temp = 2*n - 1 - flag;
			for(int j=0; j<total; j++)
			{
				if( j >= total - (total-temp)/2)
				{
					break;
				}
				else if( j >= (total-temp)/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}				
			}
			System.out.println();
			flag +=2;
		}
			
		
	}

}
