import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_2839 {

	static int n;
	

	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(in.readLine()+"");
		
		if(n ==4 || n== 7) 
			{
			System.out.println(-1);
			return;
			}
		if( n % 5 == 0) System.out.println(n/5);
		else if( n%5 %2 == 1 )System.out.println(n/5+1);
		else System.out.println(n/5 + 2);
		
	}

	

}
