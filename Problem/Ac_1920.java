import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ac_1920 {

	static int N, M;
	static int arr[], find[];

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(in.readLine());
		arr = new int[N];
		String input[];
		input = in.readLine().split(" ");
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(input[i]);
		}
		
		M = Integer.parseInt(in.readLine());
		find = new int[M];
		input = in.readLine().split(" ");
		for(int i=0; i<M; i++){
			find[i] = Integer.parseInt(input[i]);
		}
		
		Arrays.sort(arr);
		
		for(int i=0; i<M; i++) {
			if(Arrays.binarySearch(arr, find[i]) >= 0) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}
		
	}

}
