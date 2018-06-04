import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_5532 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int L,A,B,C,D;
		L = Integer.parseInt(in.readLine());
		A = Integer.parseInt(in.readLine());
		B = Integer.parseInt(in.readLine());
		C= Integer.parseInt(in.readLine());
		D = Integer.parseInt(in.readLine());
		
		int time=0;
		while(true)
		{
			if(A==0 && B == 0)
				break;
			A-=C;
			B-=D;
			if(A<0)
				A = 0;
			if(B<0)
				B = 0;
				time ++;
		}
		System.out.println(L-time);
	}

}
