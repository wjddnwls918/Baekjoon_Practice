import java.util.Scanner;

public class Ac_1520 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int m = in.nextInt();
		int n = in.nextInt();
		
		int a [][] = new int [m+1][n+1];
		int d [][] = new int [m+1][n+1];
		
		
		for(int i=1; i<=m; i++)
		{
			for( int j=1; j<=n; j++)
			{
				a[i][j] = in.nextInt();
			}
		}
		
		d[1][1] = 1;
		
		for(int i=1; i<=m; i++)
		{
			for( int j=1; j<=n; j++)
			{
				if(i ==1 && j ==1)
					continue;
				
			}
		}
		
	}

}
