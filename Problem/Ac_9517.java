import java.io.BufferedReader;
import java.io.InputStreamReader;

//크로아티아

public class Ac_9517 {

		static int K,N;
		static int T[];
		static String Z[];
		
		static int BombTotal;
		static int result;
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		K = Integer.parseInt(in.readLine());
		N = Integer.parseInt(in.readLine());
		String temp[];
		
		T = new int[N];
		Z = new String[N];
		
		for(int i=0; i<N; i++) {
			temp = in.readLine().split(" ");
			T[i] = Integer.parseInt(temp[0]);
			Z[i] = temp[1];
		}
		
		BombTotal = 210;
		result = 0;
		boolean endOfGame;
		for(int i=0; i<N; i++) {
			
			if(Z[i].equals("T")) {
				
				endOfGame = isT(i);
				if(endOfGame)
					break;
				
			}else {
				endOfGame = isNZ(i);
				if(endOfGame)
					break;
			}
			
		}
		
		System.out.println(result);
		
	}
	
	public static boolean isT(int i) {
		
		BombTotal -= T[i];
		
		if(BombTotal <= 0) {
			result = K;
			return true;
		}else {
			K+=1;
			if(K > 8)
				K = 1;
		}
		
		return false;
	}
	
	public static boolean isNZ(int i) {
		
		BombTotal -= T[i];
		if(BombTotal <= 0) {
			result = K;
			return true;
		}
		
		return false;
	}

}

//정답인데 .. 코드가 좀 기네 ??
