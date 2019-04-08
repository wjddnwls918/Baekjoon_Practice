import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_5565 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int Total = Integer.parseInt(in.readLine());
		for(int i=0; i<9; i++) {
			Total -= Integer.parseInt(in.readLine());
		}
		System.out.println(Total);
	}

}
