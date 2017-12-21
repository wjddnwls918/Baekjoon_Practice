import java.util.Scanner;

public class Ac_2293 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int k = in.nextInt();
		
		int a[] = new int[n];
		for(int i=0; i<n; i++)
			a[i] = in.nextInt();
		
		int d[] = new int[k+1];
		
		d[0] = 1;
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<=k; j++)
			{
				if(j-a[i] >= 0)
				{
					d[j] += d[j-a[i]];
				}
			}
		}		
		
		System.out.println(d[k]);
	}

}
