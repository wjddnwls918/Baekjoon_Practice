import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ac_1037 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(in.readLine());
		String input[];
		
		int arr[] = new int[cnt];
		
		input = in.readLine().split(" ");

		for(int i=0; i<cnt; i++) {
			arr[i] = Integer.parseInt(input[i]);
		}
		
		Arrays.sort(arr);
		
		if (cnt == 1) {
			System.out.println((int)Math.pow(arr[0],2));
		} else {
			System.out.println(arr[0] * arr[arr.length-1]);
		}
	}

}
