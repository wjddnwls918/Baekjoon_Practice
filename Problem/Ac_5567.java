import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Ac_5567 {

	static int n, m;
	static int check[];
	static int fList[][];

	static int result;
	
	static Queue<Info> que;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input[];

		n = Integer.parseInt(in.readLine());
		m = Integer.parseInt(in.readLine());

		fList = new int[n + 1][n + 1];
		check = new int[n + 1];

		for (int i = 0; i < m; i++) {
			input = in.readLine().split(" ");

			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);

			fList[a][b] = 1;
			fList[b][a] = 1;
		}

		result = 0;
	
		findFriend();

		System.out.println(result);
	}

	public static void findFriend() {

		que = new ArrayDeque<>();
		check[1] = 1;
		que.add(new Info(1,0));
		
		while( !que.isEmpty()) {
			
			Info cur = que.poll();
			
			if(cur.depth >= 2)
				continue;
			
			for (int i = 1; i <= n; i++) {
				if (fList[cur.curNum][i] == 1 && check[i] != 1) {

					 //System.out.println("i: "+ i +"depth: "+cur.depth);

					check[i] = 1;
					result += 1;
					que.add(new Info(i, cur.depth + 1));

				}
			}
			
			
		}
		

	}
	
	static class Info{
		int curNum;
		int depth;
		public Info(int curNum, int depth) {
			this.curNum = curNum;
			this.depth = depth;
		}
	}

}

//BFS + 양방향 그래프 
