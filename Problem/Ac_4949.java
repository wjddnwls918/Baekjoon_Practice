import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Ac_4949 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder out = new StringBuilder();
		
		while (true) {
			String input = in.readLine();

			if (input.equals("."))
				break;

			Stack<Character> stk = new Stack<>();
			boolean isOk = true;

			for (int i = 0; i < input.length(); i++) {

				if (input.charAt(i) == '(' || input.charAt(i) == '[') {
					stk.push(input.charAt(i));
				}

				if (input.charAt(i) == ')' || input.charAt(i) == ']') {

					if (stk.isEmpty()) {
						isOk = false;
						break;
					}

					char cur = stk.pop();
					
					if( (input.charAt(i)==')' && cur != '(') || (input.charAt(i)==']' && cur != '[')) {
						isOk = false;
						break;
					}
					
					
					

				}

			}

			if (stk.isEmpty() && isOk)
				out.append("yes\n");
			else
				out.append("no\n");

		}
		System.out.println(out);

	}

}
