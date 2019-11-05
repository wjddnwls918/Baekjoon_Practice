import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_2033 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		double N = Double.parseDouble(in.readLine());
		
		int i = 1;
		
		while(true) {
			
			boolean isEnd =true;
			
			if(N > Math.pow(10, i)) {
				
				isEnd = false;
				
				double temp = N / Math.pow(10, i);
				//System.out.println(temp);
				N = (int)(Math.round(temp)*Math.pow(10,i));
				
			}
			
			if(isEnd)
				break;
			
			i+=1;
			
		}
		
		System.out.println((int)N);
		
	}

}
