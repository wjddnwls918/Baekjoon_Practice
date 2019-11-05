import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_5598 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str = in.readLine();
		
		for(int i=0; i<str.length(); i++) {
			int num = str.charAt(i)-'A';
			num -= 3;
			
			if(num < 0) {
				num += 26;
			} 
			
			System.out.print((char)(num+'A'));
		}
		System.out.println();
		
	}

}
