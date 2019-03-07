import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_1977 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int M,N;
		M = Integer.parseInt(in.readLine());
		N = Integer.parseInt(in.readLine());
		
		boolean findFirst = false;
		int fir=0;
		int sum=0;
		for(int i=1; i<=100; i++) {
			
			if(!findFirst) {
				
				if(Math.pow(i, 2)>=M && Math.pow(i, 2) <=N) {
					findFirst = true;
					fir = (int)Math.pow(i, 2);
					sum += Math.pow(i, 2);
				}
				
			}else if(findFirst && Math.pow(i, 2) <= N) {
				sum+=(int)Math.pow(i, 2);
			}
			
		}
		
		if(findFirst) {		
			System.out.println(sum);
			System.out.println(fir);
		}else {
			System.out.println(-1);
		}
		
	}

}
