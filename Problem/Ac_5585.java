import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_5585 {

	static int ex[] = {500,100,50,10,5,1};
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int cost = Integer.parseInt(in.readLine());
		cost = 1000 - cost;
		
		int result =0;
		for(int i=0; i<ex.length; i++) {
			result += cost / ex[i];
			cost = cost % ex[i];			
		}
		System.out.println(result);
	}

}
