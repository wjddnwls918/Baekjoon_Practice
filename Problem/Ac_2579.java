import java.util.Scanner;

public class Ac_2579 {
	public static void main (String args[])
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n+1];
		int d[] = new int[n+1];
		
		for(int i=1; i<=n; i++)
			a[i] = in.nextInt();
		
		d[1] = a[1];
		d[2] = a[1]+a[2];
		
		for(int i=3; i<=n; i++)
		{
			d[i] = Math.max(d[i-3]+a[i-1]+a[i], d[i-2]+a[i]);
		}
		
		System.out.println(d[n]);
	}
}
