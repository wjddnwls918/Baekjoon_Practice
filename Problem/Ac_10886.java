import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_10886 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		int cute = 0, not = 0;
		int n;
		for (int i = 0; i < N; i++) {
			n = Integer.parseInt(in.readLine());
			if (n == 1)
				cute += 1;
			else
				not += 1;
		}
		
		
		if(cute > not)
			System.out.println("Junhee is cute!");
		else
			System.out.println("Junhee is not cute!");

	}

}
