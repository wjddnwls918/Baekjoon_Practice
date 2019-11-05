import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_9935 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder input = new StringBuilder(in.readLine());
		String boom = in.readLine();

		while (true) {

			boolean isEnd = true;
			
			for(int i=0; i<=input.length()-boom.length(); i++) {
								
				if(input.substring(i, i+boom.length()).equals(boom)) {
					isEnd = false;					
					input.replace(i, i+boom.length(), "");
				}
				
			}
			
		
			if(isEnd)
				break;

		}
	
		
		if (input.length()==0)
			System.out.println("FRULA");
		else
			System.out.println(input);
	}

}

//Æ²·È ³ªÁß¿¡ 
