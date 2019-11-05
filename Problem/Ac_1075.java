import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_1075 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
		int N,F;
		N = Integer.parseInt(in.readLine());
		F = Integer.parseInt(in.readLine());
	
		N = N / 100;
		
		String temp = Integer.toString(N);
		
		String result = "";
		for(int i=0; i<100; i++) {
			
			String tem="";
			if(i < 10) {
				tem +="0";
				tem +=i;
			} else
				tem +=i;
			
			int trans = Integer.parseInt(temp + tem);
						
			if( trans % F == 0) {
				result = Integer.toString(i);
				break;
			}
			
		}
		
		if(result.length() == 1) {
			System.out.println("0"+result);
		} else 
			System.out.println(result);
		
		
		
	}

}
