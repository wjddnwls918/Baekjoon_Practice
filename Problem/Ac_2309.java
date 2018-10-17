import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Ac_2309 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = new int [9];
		int total =0;
		for(int i=0; i<9; i++)
		{
			arr[i] = Integer.parseInt(in.readLine());
			total +=arr[i];
		}		
		boolean outflag = false;
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(total - (arr[i]+arr[j]) == 100)						
				{					
					arr[i] = 0;
					arr[j] = 0;
					outflag = true;
					break;
				}
			}			
			if(outflag)
				break;
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

//정답 
//재채점 틀림
//다시해서 맞음