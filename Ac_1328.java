import java.util.Scanner;

public class Ac_1328 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long mod = 1000000007L;
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int l = in.nextInt();
		int r = in.nextInt();
		
		long[][][] d = new long[n+1][n+1][n+1];
		d[1][1][1] = 1L;
		for(int i =2; i<=n; i++)
		{
			for(int j=1; j<=l; j++)
			{
				for(int k=1; k<=r; k++)
				{
					d[i][j][k] = d[i-1][j-1][k] + d[i-1][j][k-1] + d[i-1][j][k] *(i-2);
					d[i][j][k] %=mod;
				}
			}
		}
		
		System.out.println(d[n][l][r]);
		
	}

}
