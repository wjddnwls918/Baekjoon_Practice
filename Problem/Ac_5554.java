import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_5554 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int total = 0;
		for(int i=0; i<4; i++) {
			total += Integer.parseInt(in.readLine());
		}
		
		System.out.println(total / 60);
		System.out.println(total % 60);
		
	}

}
