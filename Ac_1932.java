import java.util.Scanner;

public class Ac_1932 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in  = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int a[][] = new int[n+1][n+2];
		int d[][] = new int[n+1][n+2];
		
		for(int i =1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				a[i][j] = in.nextInt();
			}
		}
		
		/*for(int i =1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}*/
		
		d[1][1] = a[1][1];
		
		for(int i =2; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				d[i][j] = Math.max(Math.max(d[i-1][j-1], d[i-1][j]),d[n-1][i+1] ) + a[i][j];
			}
		}
		
		int max = d[n][1];
		
		for(int i=2; i<=n; i++)
		{
			if(d[n][i] > max)
				max = d[n][i];
		}
		
		System.out.println(max);
	
	}

}

//맞았음 근데 시간이랑 메모리가 조금 크게 드는데 ... 
