import java.util.Scanner;

public class Ac_11726 {
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int d[] = new int[n+1];
		d[0] = 1;
		d[1] = 1;
		for(int i=2; i<=n; i++)
		{
			d[i] = d[i-1]+d[i-2];
			d[i] %= 10007;
		}
		
		System.out.println(d[n]);
	}
}
