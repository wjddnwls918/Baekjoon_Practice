import java.util.*;

public class Ac_1463 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,cnt;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
	
		int d [] = new int[n+1];
		
		d[1] = 0;		
		
		for(int i=2; i<=n; i++)
		{
			d[i] = d[i-1] +1;
			if( i%2 == 0 && d[i] > d[i/2] +1)
				d[i] = d[i/2]+1;
			if(i%3 ==0 && d[i] > d[i/3] +1)
				d[i] = d[i/3]+1;
		}
	
		System.out.println( d[n] ); 
	}

}
