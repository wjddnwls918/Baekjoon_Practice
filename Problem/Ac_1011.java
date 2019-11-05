import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_1011 {

	static long x, y;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());

		for (int tc = 1; tc <= T; tc++) {
			String input[];
			input = in.readLine().split(" ");
			x = Integer.parseInt(input[0]);
			y = Integer.parseInt(input[1]);
								
			
			System.out.println(cal(y-x));
			

		}
	}

	public static long cal(long distance) {
		
		long n = 1;
		long result = 0;
		while(true)		{
			long standard = n * n;
			long minN = standard -n +1;
			long maxN = standard + n;
			
			if(minN <= distance && distance <=maxN) {
				
				if(minN <=distance && distance <= standard)
					result = n * 2 -1;
				else
					result = n * 2;
				break;				
			}						
				
			n++;
		}
		
		return result;
		
	}

}
