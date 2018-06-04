import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_1753 {

		static int V,E;
		static int startV;
		static int u,v,w;
		
		static int map[][];
		
		static int dis[];
		static boolean check[];
			
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new	BufferedReader(new InputStreamReader(System.in));
		String temp[];
		temp = in.readLine().split(" ");
		V = Integer.parseInt(temp[0]);
		E = Integer.parseInt(temp[1]);
		startV = Integer.parseInt(in.readLine());
		
		map = new int[V][V];
		
		for(int i=0; i<E; i++)
		{
			temp = in.readLine().split(" ");
			u = Integer.parseInt(temp[0]);
			v = Integer.parseInt(temp[1]);
			w = Integer.parseInt(temp[2]);
			map[u][v] = w;
			map[v][u] = w;
		}
		
		check[startV-1] = true;
		di(startV-1);
		
	}
	
	public static void di(int v)
	{
		
	}

}
