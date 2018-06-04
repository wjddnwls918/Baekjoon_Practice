import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_1120 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String A,B;
		String temp[];
		temp = in.readLine().split(" ");
		A = temp[0];
		B = temp[1];
		int min = 987654321;

		int cnt;
		for(int i=0; i<=B.length()-A.length(); i++)
		{
			cnt = 0;
			for(int j=0; j<A.length(); j++)
			{				
				if(B.charAt(i+j) != A.charAt(j))
					cnt++;
			}
			if( min > cnt)
				min = cnt;
		}
		
		System.out.println( min );
	}

}
