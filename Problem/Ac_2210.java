import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Ac_2210 {

	static int map[][];
	
	static HashSet<String> set;
	
	//위 오른 아래 왼
	static int dx[] = {0, 1, 0, -1};
	static int dy[] = {-1, 0, 1, 0};
		
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String input[];
		map = new int[5][5];
		for(int i=0; i<5; i++) {
			input = in.readLine().split(" ");
			for(int j=0; j<5; j++) {
				map[i][j] = Integer.parseInt(input[j]);
			}
		}
		
		set = new HashSet<>();
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				makeStr(1, j, i, Integer.toString(map[i][j]));
			}
		}
		
		System.out.println(set.size());
		
	}

	public static void makeStr(int depth,int x, int y, String curStr) {
		
		if(depth == 6) {
			set.add(curStr);
		} else {
			
			for(int i=0; i<4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				if(nx>=0 && nx <5 && ny>=0 && ny< 5)
				makeStr(depth+1, nx,ny, curStr +Integer.toString(map[ny][nx]));
			}
			
		}
	}
}
