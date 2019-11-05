import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_5575 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int a[],b[],c[];
		a = new int[6];
		b = new int[6];
		c = new int[6];
		String input[];
		input = in.readLine().split(" ");
		for(int i=0; i<6; i++) {
			a[i] = Integer.parseInt(input[i]);
		}
		input = in.readLine().split(" ");
		for(int i=0; i<6; i++) {
			b[i] = Integer.parseInt(input[i]);
		}
		input = in.readLine().split(" ");
		for(int i=0; i<6; i++) {
			c[i] = Integer.parseInt(input[i]);
		}
		
		int resultA[],resultB[],resultC[];
		resultA = new int[3];
		resultB = new int[3];
		resultC = new int[3];
		
		//A
		resultA[0] = a[3] - a[0];
		resultA[1] = a[4] - a[1];
		resultA[2] = a[5] - a[2];
		
		if(resultA[2] < 0) {
			resultA[2] = 60+resultA[2];
			resultA[1] -= 1;
		}
		if(resultA[1] <0) {
			resultA[1] = 60+resultA[1];
			resultA[0] -= 1;
		}
		
		//B
		resultB[0] = b[3] - b[0];
		resultB[1] = b[4] - b[1];
		resultB[2] = b[5] - b[2];
		
		if(resultB[2] < 0) {
			resultB[2] = 60+resultB[2];
			resultB[1] -= 1;
		}
		if(resultB[1] <0) {
			resultB[1] = 60+resultB[1];
			resultB[0] -= 1;
		}
		
		
		//C
		resultC[0] = c[3] - c[0];
		resultC[1] = c[4] - c[1];
		resultC[2] = c[5] - c[2];
		
		if(resultC[2] < 0) {
			resultC[2] = 60+resultC[2];
			resultC[1] -= 1;
		}
		if(resultC[1] <0) {
			resultC[1] = 60+resultC[1];
			resultC[0] -= 1;
		}
		
		System.out.println(resultA[0] +" "+resultA[1] +" "+resultA[2]);
		System.out.println(resultB[0] +" "+resultB[1] +" "+resultB[2]);
		System.out.println(resultC[0] +" "+resultC[1] +" "+resultC[2]);
		
	}

}
