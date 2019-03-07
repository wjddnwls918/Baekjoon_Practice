import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ac_2751 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		int arr[] = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(in.readLine());
		}
		Arrays.sort(arr);
		for(int i=0; i<N; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
