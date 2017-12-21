
import java.util.*;

public class Ac_10817 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a,b,c;
		int sort[] = new int[3];
		int temp=0;
		
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		
		sort[0] = a;
		sort[1] = b;
		sort[2] = c;
		
		for( int i =0; i<sort.length-1; i++)
		{
			for (int j =i+1; j<sort.length; j++ )
			{
				if (sort[i] > sort[j])
				{
					temp = sort[j];
					sort[j] = sort[i];
					sort[i] = temp;
				}
			}
		}
		
		System.out.println(sort[1]);
		
//		for ( int i = 0; i<sort.length; i++)
//			System.out.println(sort[i]);
//		
		
	}

}
