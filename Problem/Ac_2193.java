import java.util.ArrayList;
import java.util.Scanner;

public class Ac_2193 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long result=0;
		int i=0;
		ArrayList<Long> arr = new ArrayList<>();
		
		arr.add(1L);
		arr.add(1L);
		
		for(i=0; i<n; i++)
		{
			if( i==0 || i ==1)
			{
				result =1;
				continue;
			}
			else
			{
				arr.add(arr.get(i-2)+arr.get(i-1));
			}
			
		}
		
		System.out.println(arr.get(i-1));
		
		
	}
	
	
	/*public static Boolean binary(int a,int n)
	{
		String temp ="";
		String result="";
		int num =a;
		for(int i=0; i<n; i++)
		{
			temp += Integer.toString(num %2);
			num = num/2;
		}
		
		for(int i=n-1; i>=0; i--)
			result+= temp.charAt(i);
		
		if(result.contains("11"))
			return false;
		else if( result.substring(0,1).equals("0"))
			return false;
		else 
			return true;
		
			
	}*/
}

//맞았는데 좀 길다 
// 피보나치였네 ㅡㅡ
