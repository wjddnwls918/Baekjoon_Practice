import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_2864 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input[];
		input = in.readLine().split(" ");
		String a, b;
		a = input[0];
		b = input[1];

		int min, max;
		// 최소
		String transA, transB;

		transA = "";
		transB = "";
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == '6') {
				transA += '5';
			} else {
				transA += a.charAt(i);
			}
		}
		for (int i = 0; i < b.length(); i++) {
			if (b.charAt(i) == '6') {
				transB += '5';
			} else {
				transB += b.charAt(i);
			}
		}

		min = Integer.parseInt(transA) + Integer.parseInt(transB);
		
		// 최대
		transA = "";
		transB = "";
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == '5') {
				transA += '6';
			} else {
				transA += a.charAt(i);
			}
		}
		for (int i = 0; i < b.length(); i++) {
			if (b.charAt(i) == '5') {
				transB += '6';
			} else {
				transB += b.charAt(i);
			}
		}

		max = Integer.parseInt(transA) + Integer.parseInt(transB);
		
		System.out.println(min +" "+max);
		
	}

}
