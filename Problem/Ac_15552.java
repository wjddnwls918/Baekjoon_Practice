import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ac_15552 {
	
		static int N, M;
		static int check;
		static int combi[];
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(in.readLine());
				
		int a,b;
		for(int i=1; i<=t; i++)
		{
			String line[] = in.readLine().split(" ");
			a= Integer.parseInt(line[0]);		
			b= Integer.parseInt(line[1]);
			
			out.write(String.valueOf(a+b)+"\n");
			
			
		}
		
		out.flush();
	}

}
