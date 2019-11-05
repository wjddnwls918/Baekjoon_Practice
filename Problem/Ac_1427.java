import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ac_1427 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
		String N = in.readLine();
		StringBuilder out = new StringBuilder();
		
		int arr[] = new int[N.length()];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(N.charAt(i)+"");
		}
		
		Arrays.sort(arr);
		
		for(int i=arr.length-1; i>=0; i--) {
			out.append(arr[i]);
			if(i == 0) {
				out.append("\n");
			}
		}
		
		System.out.println(out);
	}

}
