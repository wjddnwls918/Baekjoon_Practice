package notyet;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PS_2740 {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	static int N,M,K;
	
	static int A[][],B[][];
	
	static int result[][];
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		makeInput();
		solveProblem();
		printResult();
	}
	
	public static void makeInput() throws Exception {
		
		String input[];
		
		input = in.readLine().split(" ");
		
		N = Integer.parseInt(input[0]);
		M = Integer.parseInt(input[1]);
		
		A = new int[N][M];
		
		for(int i=0; i<N; i++) {
			input = in.readLine().split(" ");
			for(int j=0; j<M; j++) {
				A[i][j] = Integer.parseInt(input[j]);
			}
		}
		
		
		input = in.readLine().split(" ");
		
		M = Integer.parseInt(input[0]);
		K = Integer.parseInt(input[1]);
		
		B = new int[M][K];
		
		for(int i=0; i<M; i++) {
			input = in.readLine().split(" ");
			for(int j=0; j<K; j++) {
				B[i][j] = Integer.parseInt(input[j]);
			}
		}
		
		result = new int[N][K];
		
		
	}

	public static void solveProblem() {
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<K; j++) {
				int sum = 0;
				for(int k=0; k<M; k++) {
					sum += (A[i][k] * B[k][j]);
				}
				result[i][j] = sum;
			}
		}
		
	}
	
	public static void printResult() {
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<K; j++) {
				System.out.print(result[i][j]);
				if(j == K-1)
					System.out.println();
				else
					System.out.print(" ");
			}
		}
		
	}
	
	
}
