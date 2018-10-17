import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_10808 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String str = in.readLine();
		int alphaCnt[] = new int[26];
		
		for(int i=0; i<str.length(); i++) {
			
			alphaCnt[str.charAt(i)-'a'] += 1;		
		}
		
		
		
		
		for(int i=0; i<26; i++) {
			
			System.out.print(alphaCnt[i]);
			if(i == 25) 
				System.out.println();
			else 
				System.out.print(" ");
		}
		
	}

}
