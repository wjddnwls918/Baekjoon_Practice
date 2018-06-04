import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_1182 {

		static int N,S;
		static int arr[];
		static int combi[];
		static int check[];
		static int cnt;
	
		static int result;
		
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String temp[];
		temp = in.readLine().split(" ");
		N = Integer.parseInt(temp[0]);
		S = Integer.parseInt(temp[1]);
		arr = new int[N];
		combi = new int[N];
		temp = in.readLine().split(" ");
		for(int i=0; i<N; i++)
			arr[i] = Integer.parseInt(temp[i]);
		
		
		
		cnt = 0;
		result = 0;
		for(int j=1; j<=N; j++)
		{
			cnt = j;
			check = new int[N];
			for(int i=0; i<N; i++)
			{
				
				check[i] = 1;
				combi[0] = arr[i];
				dfs(i,0);
				combi[0] = 0;
				check[i] = 0;
			}
		}
		
		System.out.println(result);
	}
	
	public static void dfs(int pos, int depth)	
	{
		if(depth == cnt-1 )
		{
			//System.out.println("depth : "+depth);
			//System.out.println(check);
			int sum = 0;
			for(int i=0; i<N; i++)
			{
				sum += combi[i];				
			}
			if( sum == S)
				result++;
			
			return;
		}
		else
		{
			for(int i=pos+1; i<N; i++)
			{
				if( check[i] != 1 )
				{
					check[i] = 1;
					combi[depth+1] = arr[i];
					dfs(i,depth+1);
					combi[depth+1] = 0;
					check[i] = 0;
				}
			}
		}
		
	}
	

}
