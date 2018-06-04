import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ac_15651 {

	static int N, M;
	static int combi[];	
	//static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder out = new StringBuilder();
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String temp[];
		temp = in.readLine().split(" ");
		N = Integer.parseInt(temp[0]);
		M = Integer.parseInt(temp[1]);
		combi = new int[M];	
		for(int i=0; i<N; i++)
		{
				combi[0] = i+1;
				dfs(1);		
				combi[0] = 0;
		}
		
		System.out.println(out);
		
	}
	public static void dfs(int depth) throws Exception
	{
		if(depth == M)
		{
			for(int i=0; i<M; i++)
			{
				out.append(combi[i]);
				if(i==M-1)
					out.append("\n");							
				else
					out.append(" ");
				
			}		
			return;
			
		}
		else
		{
			for(int i=0; i<N; i++)
			{				
					combi[depth] = i+1;
					dfs(depth+1);	
					combi[depth] = 0;
			}
		}
	}
}
