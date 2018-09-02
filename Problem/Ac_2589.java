import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_2589 {

	static int map[][];
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int R,C;
		String tem[];
		tem = in.readLine().split(" ");
		R = Integer.parseInt(tem[0]);
		C = Integer.parseInt(tem[1]);
		
		map = new int[R][C];
		String info;
		for(int i=0; i<R; i++)
		{
			info = in.readLine();
			for(int j=0; j<C; j++)
			{
				map[i][j] = info.charAt(j);
			}
		}
		
	}

}
