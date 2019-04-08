import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Ac_2644 {

	static int n, m;
	static int s, d;
	static int map[][];
	static int check[];

	static int result;

	static Queue<Info> que;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(in.readLine());
		String input[];
		input = in.readLine().split(" ");
		s = Integer.parseInt(input[0]);
		d = Integer.parseInt(input[1]);

		map = new int[n + 1][n + 1];
		check = new int[n + 1];

		m = Integer.parseInt(in.readLine());
		for (int i = 0; i < m; i++) {
			input = in.readLine().split(" ");
			int parent = Integer.parseInt(input[0]);
			int child = Integer.parseInt(input[1]);
			map[parent][child] = 1;
		}

		// printTest();
		result = -1;
		que = new ArrayDeque<>();
		find(s, 0);

		System.out.println(result);
	}

	public static void find(int s, int cnt) {

		check[s] = 1;
		que.add(new Info(s, 0));

		while (!que.isEmpty()) {

			Info cur = que.poll();
			

			//System.out.println("check : " + cur.curNum);

			if (cur.curNum == d) {
				// System.out.println("check 1 "+s);
				result = cur.cnt;
				break;
			}

			
			int parent = findPar(cur.curNum);

			if (parent != -1) {

				// 부모쪽
				if (check[parent] != 1) {
					check[parent] = 1;
					que.add(new Info(parent, cur.cnt + 1));
					
				}
				// 형제에 있는지 찾는다
				for (int i = 1; i <= n; i++) {
					if (map[parent][i] == 1 && check[i] != 1) {
						check[i] = 1;
						que.add(new Info(i, cur.cnt+2));
					}
				}

			}

			// 자식쪽
			for (int i = 1; i <= n; i++) {
				if (map[cur.curNum][i] == 1 && check[i] != 1) {
					check[i] = 1;
					que.add(new Info(i, cur.cnt + 1));
				}
			}


			if (result != -1)
				break;
		}

	}

	public static int findPar(int s) {
		int findPar = -1;
		for (int i = 1; i <= n; i++) {
			if (map[i][s] == 1) {
				findPar = i;
				break;
			}
		}
		return findPar;
	}

	public static int findChild(int s) {
		int findChild = 0;
		for (int i = 1; i <= n; i++) {
			if (map[s][i] == 1) {
				findChild = i;
				break;
			}
		}
		return findChild;
	}

	public static void printTest() {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(map[i][j]);
				if (j == n)
					System.out.println();
				else
					System.out.print(" ");
			}
		}
	}

	static class Info {

		int curNum;
		int cnt;

		public Info(int curNum, int cnt) {
			this.curNum = curNum;
			this.cnt = cnt;
		}
	}

}
