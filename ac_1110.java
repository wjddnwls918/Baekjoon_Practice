
import java.util.*;

public class ac_1110 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n,ini,cnt,ten,one;
		
		
		Scanner in = new Scanner(System.in);
		
		n = in.nextInt();
		ini = n;

		ten =0;
		one =0;
		cnt =0;
		
		do
		{
			ten = ini/10;
			one = ini%10;
			
			//System.out.println(ten+ " " +one);
			
			ini = (one*10) + (ten+one)%10;
			//System.out.println(ini);
			cnt++;
			
		}while(ini!= n);
	
		System.out.println(cnt);
		
//		while( ini!= n)
//		{
//			ten = ini/10;
//			one = ini%10;
//			
//			System.out.println(ten+ " " +one);
//			
//			ini = (one*10) + (ten+one)%10;
//			System.out.println(ini);
//		}
		
	}

}
