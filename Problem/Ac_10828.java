import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class Ac_10828 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder out = new StringBuilder();
		int N = Integer.parseInt(in.readLine());
		
		String input[];
		Stack<Integer> stk = new Stack<>();
		for(int i=0; i<N; i++) {
			input= in.readLine().split(" ");
						
			if(input[0].equals("push")) {
				stk.push(Integer.parseInt(input[1]));
			} else if( input[0].equals("pop")) {
				if(stk.isEmpty()) {
					out.append(-1+"\n");
				} else {
					out.append(stk.pop()+"\n");
				}
			} else if( input[0].equals("size")) {
				out.append(stk.size()+"\n");
			} else if( input[0].equals("empty")) {
				if(stk.isEmpty()) {
					out.append(1+"\n");
				} else {
					out.append(0+"\n");
				}
			} else {
				//top
				if(stk.isEmpty()) {
					out.append(-1+"\n");
				} else {
					out.append(stk.peek()+"\n");
				}
			}
			
		}
		
		System.out.println(out);
		
	}
}
