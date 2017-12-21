import java.util.*;

public class Ac_2577 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int a,b,c,mul ;
		String parstr;
		char check[] = {'0','1','2','3','4','5','6','7','8','9'};
		int cnt[] = new int[10];
		
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		mul = a * b * c;
		parstr = Integer.toString(mul);
		

		for(int i =0; i< parstr.length(); i++)
		{
			for( int j =0; j< check.length; j++)
			{
				if(parstr.charAt(i) == check[j])
				{
					cnt[j] ++;
				}				
			}
		}
		
		for ( int i =0; i<check.length; i++)
		{
			System.out.println(cnt[i]);
		}
		
		
		
	}

}
