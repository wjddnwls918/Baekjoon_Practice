import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Ac_2789 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder out = new StringBuilder();
		HashSet<Character> set = new HashSet<>();
		set.add('C');
		set.add('A');
		set.add('M');
		set.add('B');
		set.add('R');
		set.add('I');
		set.add('D');
		set.add('G');
		set.add('E');
		
		String input = in.readLine();
		
		for(int i=0; i<input.length(); i++) {
			if(!set.contains(input.charAt(i))) {
				out.append(input.charAt(i));
			}
		}
		out.append("\n");
		
		System.out.println(out);
		
		
	}

}
