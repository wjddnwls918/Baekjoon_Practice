import java.util.Scanner;

public class Ac_1978 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int cnt=0;
		int arr[] = new int[n];
		for(int i=0; i<n; i++)
			arr[i] = in.nextInt();
		
		for(int i=0; i<n; i++)
		{
			if(is_prime(arr[i]))
				cnt++;			
		}
		System.out.println(cnt);
	}

	public static boolean is_prime(int n)
	{
		if (n==1)
			return false;
		
		for(int i=2; i<=n-1; i++)
		{
			if(n % i ==0)
					return false;
		}
		
		return true;
	}
}
