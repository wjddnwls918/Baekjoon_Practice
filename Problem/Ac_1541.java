import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Ac_1541 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str = in.readLine();
		String transStr = str.replaceAll("[-]|[+]", " ");
		
		String num[] = transStr.split(" ");	
		ArrayList <Character>arr = new ArrayList<>();
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='+' || str.charAt(i) =='-') {
				arr.add(str.charAt(i));
			}
		}
		
		int result = Integer.parseInt(num[0]);
		
		boolean isMinus =false;
		int pos = 1;
		for(int i=0; i<arr.size(); i++) {
			if(arr.get(i) == '-') {
				isMinus = true;
				result -= Integer.parseInt(num[pos]);
				pos +=1;
				continue;			
			}		
			
			if(arr.get(i) == '+' && isMinus) {
				result -= Integer.parseInt(num[pos]);
				pos +=1;
				continue;
			}		
		}
		
		System.out.println(result);
	}

}

//Æ²¸²
