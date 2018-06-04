import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_6603 {

		static int k;
		static int num[];
		static int lotto[];
		static int check[];
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String temp[];
		
		while (true)
		{
			temp = in.readLine().split(" ");
			k = Integer.parseInt(temp[0]);
			if(k == 0)
				break;
			
			num = new int[k];
			for(int i=1; i<=k; i++)
			{
				num[i-1] = Integer.parseInt(temp[i]);
			}
			
			/*for(int i=0; i<k; i++)
			{
				System.out.println(num[i]);
			}*/

			check = new int[k];
			lotto = new int[6];
			for(int i=0; i<=k-6; i++)
			{				
				check[i] = 1;
				lotto[0] = num[i];
				com(i+1,1);
				lotto[0] = 0;
				check[i] = 0;
				
			}
			System.out.println();
		}
	}
	public static void com(int start,int depth)
	{
		if(depth == 6)
		{
			for(int i=0; i<6; i++)
			{
				System.out.print(lotto[i]);
				if(i == 5)
					System.out.println();
				else
					System.out.print(" ");
			}
		}
		else
		{
			for(int i=start; i<k; i++)
			{
				if(check[i] !=1)
				{
					check[i] = 1;
					lotto[depth] = num[i];
					com(i+1,depth+1);
					lotto[depth] = 0;
					check[i] = 0;
				}
			}
		}
		
	}

}

//정답
