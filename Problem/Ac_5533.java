import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_5533 {

	static int score[][];

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		String input[];
		score = new int[N][3];
		for (int i = 0; i < N; i++) {
			input = in.readLine().split(" ");
			for (int j = 0; j < 3; j++) {
				score[i][j] = Integer.parseInt(input[j]);
			}
		}

		int result[] = new int[N];
		for (int i = 0; i < 3; i++) {
			

			for (int k = 0; k < N; k++) {
				boolean isOk = true;
				for (int j = 0; j < N; j++) {
					if (k!=j && score[k][i] == score[j][i] ) {
						isOk = false;
						break;
					}
				}
				
				if(isOk) {
					result[k] += score[k][i];
				}
			}
		}
		
		for(int i=0; i<N; i++) {
			System.out.println(result[i]);
		}

	}

}
