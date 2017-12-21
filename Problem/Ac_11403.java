import java.util.Scanner;

public class Ac_11403 {
	
	public static int c[][];
	public static int map[][];
	public static int n;
	public static int result[][];
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n= in.nextInt();
		
		map = new int[n+1][n+1];
		c = new int[n+1][n+1];
		result = new int [n+1][n+1];
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<= n; j++)
			{
				map[i][j] = in.nextInt();
			}
		}
		
		for(int i=1; i<=n; i++) {
			int[] visit = new int[n+1];
			dfs(i, visit, true);
			result[i] = visit;
		}
                //출력
		for(int i=1; i<result.length; i++) {
			for(int j=1; j<result[i].length; j++) {
				System.out.print(result[i][j]+" ");
			}if(i != result.length-1) System.out.println();
		}
	}
	
	
	public static void dfs(int i, int[] visit, boolean isFirst) {
		if(!isFirst)visit[i] = 1; //isFirst를 안쓰면 첫번째 탐색은 밑의 if문에 통과되지 못함.
		for(int j=1; j<=n; j++) {
			if(map[i][j] == 1 && visit[j] == 0) {
				dfs(j, visit, false);
			}
		}
	}
}