import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_1748 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		
		int zariCount[] = new int[10];
		for(int i=1; i<9; i++) {
			zariCount[i] = (int)(Math.pow(10, i) - Math.pow(10, i-1)) * i;
		}
		zariCount[9] = 1 * 9;
		
		/*for(int i=0; i<10; i++) {
			System.out.println(zariCount[i]);
		}*/
		
		int result = 0;
		for(int i=1; i<10; i++) {
			if(N >= (int)Math.pow(10, i-1) && N < (int)Math.pow(10, i)) {
				for(int j=1; j<i; j++) {
					result += zariCount[j];
				}
				
				result += (N - Math.pow(10, i-1) + 1) * i;
				
			}
		}
		
		System.out.println(result);
		
		
	}

}

//Á¤´ä
