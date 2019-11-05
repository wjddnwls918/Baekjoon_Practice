import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ac_1003 {

	static int num0Cnt[];
	static int num1Cnt[];

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());

		num0Cnt = new int[41];
		num1Cnt = new int[41];

		num0Cnt[0] = 1;
		num1Cnt[0] = 0;

		num0Cnt[1] = 0;
		num1Cnt[1] = 1;

		num0Cnt[2] = 1;
		num1Cnt[2] = 1;

		num0Cnt[3] = 1;
		num1Cnt[3] = 2;
					
		for(int i=4; i<=40; i++) {
			num0Cnt[i] += ( num0Cnt[i-1] + num0Cnt[i-2]);
			num1Cnt[i] += ( num1Cnt[i-1] + num1Cnt[i-2]);
		}
		

		for (int i = 0; i < T; i++) {
		
			int num = Integer.parseInt(in.readLine());			
		
			System.out.println(num0Cnt[num] + " " + num1Cnt[num]);

		}

	}

}

// Á¤´ä
