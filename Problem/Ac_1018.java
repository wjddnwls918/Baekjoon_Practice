import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_1018 {

	static int N, M;
	static char map[][];

	static int min;

	static char turn[] = { 'W', 'B' };

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input[];
		input = in.readLine().split(" ");
		N = Integer.parseInt(input[0]);
		M = Integer.parseInt(input[1]);

		map = new char[N][M];

		String temp;
		for (int i = 0; i < N; i++) {
			temp = in.readLine();
			for (int j = 0; j < M; j++) {
				map[i][j] = temp.charAt(j);
			}
		}

		min = 987654321;

		// 최소값 확인

		for (int i = 0; i <= N - 8; i++) {
			for (int j = 0; j <= M - 8; j++) {
				check(j, i);
			}
		}

		System.out.println(min);
	}

	public static void check(int x, int y) {
		
		
		
		for (int k = 0; k < 2; k++) {

			
			int cnt = 0;
			
			for (int i = y; i < y + 8; i++) {
				
				int curTurn;
				if(i %2== 0) {
					curTurn = k;
				} else {
					curTurn = (k+1)%2;
				}
				
				for (int j = x; j < x + 8; j++) {
					if(map[i][j] != turn[curTurn]) {
						cnt += 1;
					}
					
					curTurn = (curTurn +1) % 2;
				}			
				
			}
			
			if(cnt < min) {
				min = cnt;
			}

		}

	}

}
