import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_2804 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input[];
		input = in.readLine().split(" ");
		String A,B;
		A = input[0];
		B = input[1];
		
		int x=0,y=0;
		boolean find = false;
		find: for(int i=0; i<A.length(); i++) {
			for(int j=0; j<B.length(); j++) {
				if(A.charAt(i) == B.charAt(j)) {
					x = i;
					y = j;					
					break find;
				}
			}
			
		}
		
		for(int i=0; i<B.length(); i++) {
			for(int j=0; j<A.length(); j++) {
				if(j == x) {
					System.out.print(B.charAt(i));
				} else if(i == y) {
					System.out.print(A.charAt(j));
				}else
					System.out.print(".");
				
				if(j==A.length()-1)
					System.out.println();
			}
		}
		
	}

}
