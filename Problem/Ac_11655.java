import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_11655 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String str = in.readLine();
		
		int capitalAlpha[] = new int[26];
		int alpha[] = new int[26];
		
		for(int i=0; i<26; i++) {
			alpha[i] = 'a'+i;
			capitalAlpha[i] = 'A'+i;
		}
		
		/*for(int i=0; i<26; i++) {
			System.out.println((char)alpha[i] +" "+(char)capitalAlpha[i]);
		}*/
		String ROT13 = "";
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) >='a' && str.charAt(i) <='z') {
				ROT13 += (char)(alpha[ (str.charAt(i) - 'a' + 13) % 26 ]);
			}else if( str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				ROT13 += (char)(capitalAlpha[ (str.charAt(i) - 'A' + 13) % 26 ]);
			}else {
				ROT13 += str.charAt(i);
			}
		}
		
		System.out.println(ROT13);
	}	

}
