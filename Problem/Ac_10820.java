import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_10820 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input = "";

		int loCnt, upCnt, numCnt, spaceCnt;
		while ((input = in.readLine()) != null) {			
			if (input.length() == 0)
				break;

			loCnt = 0;
			upCnt = 0;
			numCnt = 0;
			spaceCnt = 0;

			for (int i = 0; i < input.length(); i++) {
				if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
					loCnt += 1;
				} else if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {
					upCnt += 1;
				} else if (input.charAt(i) >= '0' && input.charAt(i) <= '9') {
					numCnt += 1;
				} else {
					spaceCnt += 1;
				}
			}
			
			System.out.println(loCnt +" " + upCnt +" " + numCnt +" "+ spaceCnt);

		}
	}

}