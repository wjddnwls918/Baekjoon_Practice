import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Ac_1094 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int X = Integer.parseInt(in.readLine());		
		int len = 64;		
		int cnt=0;
		while(X>0)
		{			
			if (len > X) {
                len/= 2;
            } else {
                cnt++;
                X -= len;
            }
		}
		System.out.println(cnt);
		
	}

}
