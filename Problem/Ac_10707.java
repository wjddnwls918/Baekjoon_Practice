import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_10707 {

		static int A,B,C,D,P;
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		A = Integer.parseInt(in.readLine());
		B = Integer.parseInt(in.readLine());
		C = Integer.parseInt(in.readLine());
		D = Integer.parseInt(in.readLine());
		
		P = Integer.parseInt(in.readLine());
		
		int xCost=0,yCost=0;
		xCost = P * A;
		
		yCost += B;
		if(P > C) {
			yCost += (P-C) * D;
		}
		
		if(xCost > yCost)
			System.out.println(yCost);
		else
			System.out.println(xCost);
		
	}

}
