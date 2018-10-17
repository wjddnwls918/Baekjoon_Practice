import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_5622 {

		static String dial[] = {"ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String str = in.readLine();
		
		int time = 0;
		time += str.length();
		for(int i=0; i<str.length(); i++) {
			
			for(int j=0; j<8; j++) {
				if(dial[j].contains(str.charAt(i)+"")) {
					time+=j+2;
				}
			}
			
		}
		System.out.println(time);
	}	

}
