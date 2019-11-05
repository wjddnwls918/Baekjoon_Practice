import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.io.BufferedReader;

public class Ac_2783 {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		double min;
		String input[];
		input = in.readLine().split(" ");
		double X,Y;
		X = Integer.parseInt(input[0]);
		Y = Integer.parseInt(input[1]);
		
		min = (X/Y) * 1000;

		int N = Integer.parseInt(in.readLine());
		for (int i = 0; i < N; i++) {
			input = in.readLine().split(" ");
			X = Integer.parseInt(input[0]);
			Y = Integer.parseInt(input[1]);

			if(min >= (X/Y) * 1000) {
				min = (X/Y) * 1000;
			}
		}
	
		System.out.println(min);

	}

}
