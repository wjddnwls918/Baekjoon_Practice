import java.util.Scanner;

public class Ac_14888 {

	static int n;
	static int num[] ;
	static int op[] ;
	static int visit[];
	
	static int min,max;
	
	static int temp;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in  = new Scanner(System.in);
		
		n = in.nextInt();
		
		num = new int[n];
		op = new int[4];
		
		visit = new int[n-1];
		
		for(int i=0; i<num.length; i++)
		{
			num[i] = in.nextInt();
		}
		
		for(int i=0; i<4; i++)
		{
			op[i] = in.nextInt();
		}
		
		//max, min 초기값 설정 잘해야되네 
		max = -2000000000;
		min = 2000000000;
		temp = 0;
		
		for(int i = 0; i<4; i++) {
			
			if(op[i] != 0)
				dfs(i,1);
		}
		
		
		System.out.println(max);
		System.out.println(min);

	}
	
	public static void dfs(int i,int depth)
	{
		op[i] --;
		visit[depth-1] = i;
		
		if(depth == n-1)
		{
			temp = num[0];
			
			for(int j = 0; j<visit.length; j++)
			{
				/*System.out.print(visit[j]);
				if(j == visit.length-1)
					System.out.println();
				else
					System.out.print(" ");*/
				
				if(visit[j] == 0)
				{
					temp = temp + num[j+1];
				}
				else if( visit[j] == 1)
				{
					temp = temp - num[j+1];
				}
				else if( visit[j] == 2)
				{
					temp = temp * num[j+1];
				}
				else
				{
					temp = temp / num[j+1];
				}
			}
			
			if( temp > max)
				max = temp;
			if( temp < min)
				min = temp;
			
			
		}
		
		else
		{
			for(int j = 0; j<4; j++) {
				
				if(op[j] != 0)
					dfs(j,depth+1);
			
			}
		}
		
		
		op[i]++;
	}

}
