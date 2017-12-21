import java.util.Scanner;

public class Ac_11021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n= in.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		
		for(int i=0; i<n; i++)
		{
			a[i] = in.nextInt();
			b[i] = in.nextInt();
		}
		
		for(int i=0; i<n; i++)
		{
			System.out.println("Case #"+(i+1)+": "+(a[i]+b[i]));
		}
		
		
	}

}
