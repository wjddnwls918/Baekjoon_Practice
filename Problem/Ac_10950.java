import java.util.*;

public class Ac_10950 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t,a[],b[];
		t = in.nextInt();
		
		a = new int[t];
		b = new int[t];
		
		for ( int i=0; i<t; i++)
		{
			a[i] = in.nextInt();
			b[i] = in.nextInt();
		}
		
		for (int i =0; i<t; i++)
		{
			System.out.println(a[i] + b[i]);
		}
	}

}
