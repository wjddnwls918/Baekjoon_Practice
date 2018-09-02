import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_2606 {

		static int V,E;
		
		static int map[][];
		static int visit[];
		
		static int result;
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		V = Integer.parseInt(in.readLine());
		E = Integer.parseInt(in.readLine());
		
		map = new int[V+1][V+1];
		
		String temp[];
		for(int i=0; i<E; i++) {
			
			temp = in.readLine().split(" ");
			map[Integer.parseInt(temp[0])][Integer.parseInt(temp[1])] = 1;
			map[Integer.parseInt(temp[1])][Integer.parseInt(temp[0])] = 1;
			
		}
		
		visit = new int[V+1];
	
		
		visit[1] = 1;
		result = 0;
		find(1);
		
		System.out.println(result);
	}
	
	public static void find(int index){
		
		for(int j=1; j<=V; j++) {
			if(visit[j] == 1)
				continue;
			if(map[index][j] == 1) {
				visit[j] = 1;
				result ++;
				find(j);				
				
			}
		}
		
	}

}

//정답. 메모리, 실행시간 양호