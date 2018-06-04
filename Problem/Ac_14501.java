import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_14501 {

		static int N;
	
		static int T[];
		static int P[];
	
		static int combi[];
		static int check[];
		
		static int result;
		
		
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(in.readLine());
		String temp[];
		
		
		T = new int[N];
		P = new int[N];
		
		combi = new int[N];
		check = new int[N];
		for(int i=0; i<N; i++)
		{
			temp = in.readLine().split(" ");
			T[i] = Integer.parseInt(temp[0]);
			P[i] = Integer.parseInt(temp[1]);
			if(i + T[i]-1 >= N )
			{
				check[i] = 1;
			}
		}
		
		
		//초기화 잘해야됨 . -가 나올수 없다 .
		/*
		 * 1
		 * 2 5
		 * 
		 */
		result = 0;
		for(int i=0; i<N; i++)
		{
			if(check[i] !=1 )
			{
				check[i] = 1;
				combi[i] = P[i]; 
				dfs(i+T[i]);
				combi[i] = 0;
				check[i] = 0;
			
			}
			
		}
		
		System.out.println(result);
	}
	public static void dfs(int pos)
	{
		int sum=0;
		for(int i=0; i<N; i++)
		{
			sum += combi[i];
		}
		result = Math.max(result,sum);
		
		
		for(int i=pos; i<N; i++)
		{
			if(check[i] !=1 && i+T[i] <=N )
			{
				check[i] = 1;
				combi[i] = P[i]; 
				dfs(i+T[i]);
				combi[i] = 0;
				check[i] = 0;			
			}			
		}
		
		
	}

}
