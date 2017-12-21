import java.util.Scanner;

//포도주 시식

public class Ac_2156 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner( System.in);
		int n = in.nextInt();
		int a[] = new int[n+1];
		int d[] = new int[n+1];
		
		for(int i =1; i<=n; i++)
			a[i] = in.nextInt();
	
	
		d[1] = a[1];
		if( n>=2)
		{
		d[2] = a[1]+a[2];
		
		}
		for(int i=3; i<=n; i++)
		{
			 d[i] = d[i-1];
	            d[i] = Math.max(d[i], d[i-2]+a[i]);
	            d[i] = Math.max(d[i], d[i-3]+a[i-1]+a[i]);
		}
		
		int max = d[1];
		for(int i=2; i<=n; i++)
		{
			if (max < d[i])
				max = d[i];
		}
		
		System.out.println(max);
	}

}
