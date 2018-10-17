import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_1032 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		String str[] = new String[N];
		for(int i=0; i<N; i++) {
			str[i] = in.readLine();			
		}
		
		char cur;
		
		for(int i=0; i<str[0].length(); i++) {
			
			cur = str[0].charAt(i);
			boolean isOk = true;
			for(int j=1; j<N; j++) {
				
				if(cur != str[j].charAt(i)) {
					isOk = false;
					break;
				}		
			
			}
			if(isOk)
				System.out.print(cur);
			else 
				System.out.print('?');
			
		}
		System.out.println();
		
		
	}

}
