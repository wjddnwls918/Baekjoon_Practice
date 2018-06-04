import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ac_15650 {

	
	static int N, M;
	static int check;
	static int combi[];
	
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String temp[];
		temp = in.readLine().split(" ");
		N = Integer.parseInt(temp[0]);
		M = Integer.parseInt(temp[1]);
		combi = new int[M];
		check = 0;
		for(int i=0; i<N; i++)
		{
			if((check & (1<<i)) != 1<<i)
			{
				check |= 1<<i;
				combi[0] = i+1;
				dfs(i+1,1);
				combi[0] = 0;
				check &= ~(1<<i);
			}
		}
	}
	
	public static void dfs(int num, int depth) throws Exception
	{
		if(depth == M)
		{
			for(int i=0; i<M; i++)
			{
				out.write(Integer.toString(combi[i]));
				if(i==M-1)
					out.write("\n");							
				else
					out.write(" ");
				
			}
			out.flush();
			
		}
		else
		{
			for(int i=0; i<N; i++)
			{
				if((check & (1<<i)) != 1<<i && num < i+1)
				{
					check |= 1<<i;
					combi[depth] = i+1;
					dfs(i+1,depth+1);
					combi[depth] = 0;
					check &= ~(1<<i);
				}
			}
		}
	}

}
