import java.util.*;

public class Ac_1546 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n;
		double avg,a[],r[],temp;
		
		n = in.nextInt();
		a = new double[n];
		r = new double[n];
		avg =0; temp=0;
				
		for( int i=0; i<a.length; i++)
		{
			a[i] = in.nextDouble();
		}
		Arrays.sort(a);
		
		for( int i=0; i<a.length; i++)
		{
			r[i] = a[i]/a[a.length-1]*100;
		}

		for( int i=0; i<r.length; i++)
		{
			avg += r[i];
		}

		temp = avg /n;
		temp = temp *1000;
		if ( temp % 1 >= 5)
		{
			temp += 10;
		}
		temp = temp/ 1000;
		System.out.println(  String.format("%.2f", temp) );
				
	}

}
