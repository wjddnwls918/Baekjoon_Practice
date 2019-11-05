import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Ac_2629 {

	static int N, result;

	static int arr[];

	static final int MAX = 30;
	static int check[][];

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(in.readLine());
		arr = new int[N];
		String input[];
		input = in.readLine().split(" ");

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(input[i]);
		}

		check = new int[MAX + 1][MAX * 500 + 1];
		// üũ
		checkW(0,0);

		result = Integer.parseInt(in.readLine());
		input = in.readLine().split(" ");
		for (int i = 0; i < result; i++) {

			if (Integer.parseInt(input[i]) > MAX * 500) {
				System.out.print("N");
			} else if (check[N][Integer.parseInt(input[i])] == 1) {
				System.out.print("Y");
			} else {
				System.out.print("N");
			}

			if (i == result - 1) {
				System.out.println();
			} else
				System.out.print(" ");
		}

	}

	public static void checkW(int depth,int weight) {

		if(check[depth][weight]!= 0)
			return;
		
		check[depth][weight] = 1;	
		
		
		if (depth >=  N) {
			return;
		} 
			
		
			
			
			checkW(depth+1, weight + arr[depth]);
			
			checkW(depth+1, weight);
			
			checkW(depth+1, Math.abs(weight - arr[depth]));
			
		

	}

}
