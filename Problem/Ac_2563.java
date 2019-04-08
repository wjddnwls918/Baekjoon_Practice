import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_2563 {

	static int map[][];
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		map = new int[101][101];
		
		String input[];
		for(int i=0; i<N; i++) {
			input = in.readLine().split(" ");
			
			int x = Integer.parseInt(input[0]);
			int y = Integer.parseInt(input[1]);
			
			for(int j=y; j<y+10; j++) {
				for(int k=x; k<x+10; k++) {
					map[j][k] = 1;
				}				
			}
			
		}
		
		System.out.println(resultCnt());
		
	}
	

	public static int resultCnt() {
		int result = 0;
		for(int i=0; i<=100; i++) {
			for(int j=0; j<=100; j++) {
				if(map[i][j] == 1)
					result +=1;
			}
		}
		
		return result;
	}

}
