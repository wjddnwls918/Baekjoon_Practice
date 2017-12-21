
import java.util.*;

public class Ac_10871 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		Scanner in = new Scanner(System.in);
		int n,x;
		
		n = in.nextInt();
		x = in.nextInt();
		
		int array[] = new int[n];
		
		
		for(int i =0; i<n; i++)
		{
			array[i] = in.nextInt();
		}
		
		for(int i =0; i<n; i++)
		{
			if(array[i] < x)
			{
				System.out.print(array[i]+" ");
			}
		}
		
		
		
	}

}
