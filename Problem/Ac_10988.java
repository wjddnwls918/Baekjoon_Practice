import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_10988 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str = in.readLine();
		
		int l = 0;
		int r = str.length()-1;
		boolean isOk = true;
		while(l<r) {
			
			if(str.charAt(l) != str.charAt(r)) {
				isOk =false;
				break;
			}			
			
			l++;
			r--;
		}
		if(isOk)
			System.out.println(1);
		else
			System.out.println(0);
	}

}
