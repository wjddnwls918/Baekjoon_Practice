import java.util.Scanner;

public class Ac_1890 {
	
	public static int n;
	public static int cnt=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		n = in.nextInt();
		
		int a[][] = new int[n+1][n+1];
		long d[][] = new long[n+1][n+1];
		
		for(int i=0; i<n; i++)
		{
			for(int j = 0; j<n; j++)
			{
				a[i][j] = in.nextInt();
			}
		}
		
		d[0][0] = 1;
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(i ==0 && j ==0) continue;
				for(int k=0; k<j; k++)
				{
					if(k+a[i][k] == j)
						d[i][j] += d[i][k];
				}
				
				for(int k=0; k<i; k++)
				{
					if(k+a[k][j] == i)
					{
						d[i][j] += d[k][j];
					}
				}
			}
		}
		
		System.out.println(d[n-1][n-1]);
	}
	
	

}
