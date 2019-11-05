import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_3053 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int R = Integer.parseInt(in.readLine());
		double uclidRoundArea = 0;
		double taxiRoundArea = 0;

		uclidRoundArea = Math.PI * Math.pow(R, 2);
		taxiRoundArea = 2 * Math.pow(R, 2);
		System.out.println(uclidRoundArea);
		System.out.println(taxiRoundArea);
	}

}
