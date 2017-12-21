import java.util.*;

public class Ac_1026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n,a[],b[],temp,result;
		
		n = in.nextInt();
		a = new int[n];
		b = new int[n];
		
		
		for(int i=0; i<n; i++)
		{
			a[i] = in.nextInt();
		}
		for(int i=0; i<n; i++)
		{
			b[i] = in.nextInt();
		}
		
		Arrays.sort(a);
		
		temp =0;
		result =0;
		for(int i=0; i<n-1; i++)
		{
			for( int j=i+1; j<n; j++)
			{
				if( b[i] < b[j])
				{
					temp = b[j];
					b[j] = b[i];
					b[i] = temp;
				}
			}
		}
//		
//		for(int i=0; i<n; i++)
//		{
//			System.out.println(a[i] + " " + b[i]);
//		}
//		
		for(int i=0; i<n; i++)
		{
			result += a[i] * b[i];
		}
		
		System.out.println(result);
	}

}
