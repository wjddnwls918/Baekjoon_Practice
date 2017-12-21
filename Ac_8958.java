import java.util.*;

public class Ac_8958 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int n,cur,result[];
		String str[];
		
		n = in.nextInt();
		str = new String[n];
		result = new int[n];
		cur = 1;
		
		for(int i=0; i< n; i++)
		{
			str[i] = in.next();
			result[i] = 0;
		}
		
		for(int i=0; i < n; i++)
		{
			for( int j =0; j< str[i].length(); j++)
			{
				if (str[i].charAt(j) == 'O') 
				{
					result[i] += cur++;
				}
				else
				{
					cur = 1;
					
				}
			}
			
			cur = 1;
			
		}
		
		for(int i =0; i<n; i++)
		{
			System.out.println(result[i]);
		}
	}

}
