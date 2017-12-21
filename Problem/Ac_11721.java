
import java.util.*;

public class Ac_11721 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		
		Scanner in = new Scanner(System.in);
		str = in.next();
		
		for (int i=0; i<str.length(); i++)
		{
			if( i%10 ==0 && i!=0)
			{
				System.out.println();			
			}
			
				System.out.print(str.charAt(i)) ;
				
		}
	}

}
