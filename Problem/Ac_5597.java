import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_5597 {

	static int check[];
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		check = new int[31];
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(int i=0; i<28; i++) {
			check[Integer.parseInt(in.readLine())] = 1;
		}
		
		for(int i=1; i<=30; i++) {
			if(check[i] == 0) {
				System.out.println(i);
			}
		}
	}

}
