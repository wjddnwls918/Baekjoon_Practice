import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_10824 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str[] = in.readLine().split(" ");
		long result = Long.parseLong(str[0]+str[1]) + Long.parseLong(str[2]+str[3]);
		System.out.println( result );
	}

}
