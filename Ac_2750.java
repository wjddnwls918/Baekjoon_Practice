import java.util.*;

public class Ac_2750 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,array[],temp;
		
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		array = new int[n];
		
		for(int i=0; i<array.length; i++)
		{
			array[i] = in.nextInt();
		}
		
		temp=0;
		
		for(int i=0; i<array.length-1; i++)
		{
			for (int j = i+1; j<array.length; j++)
			{
				if( array[i] > array[j])
				{
					temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		
		
		for(int i=0; i<array.length; i++)
		{
			System.out.println(array[i] );
		}
		
	}

}
