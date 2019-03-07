import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_4963 {
	
	static int w,h;
	static int map[][];
	static int check[][];

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String temp[];
		while(true) {
			temp = in.readLine().split(" ");
			w = Integer.parseInt(temp[0]);
			h = Integer.parseInt(temp[1]);
			
			if(w==0 && h==0) {
				break;
			}
			
			map = new int[h][w];
			check = new int[h][w];
		
		}
		
	}
	
	public static void dfs() {
		
	}

}
