import java.util.Arrays;
import java.util.Scanner;

public class Ac_2309 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int arr[] = new int [9];
		int total =0;
		for(int i=0; i<9; i++)
		{
			arr[i] = in.nextInt();
			total +=arr[i];
		}		
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(total - (arr[i]+arr[j]) == 100)						
				{					
					arr[i] = 0;
					arr[j] = 0;
				}
			}			
		}								
		Arrays.sort(arr);		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] == 0 )
				continue;
			System.out.println(arr[i]);		
		}
		
	}
}

//Á¤´ä 
