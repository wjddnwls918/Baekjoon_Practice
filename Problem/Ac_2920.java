import java.util.*;

public class Ac_2920 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int pre,cur;
		String result;
		int arr[] = new int[8];
		
		for(int i=0; i<arr.length; i++)
			arr[i] = in.nextInt();
		
		pre = arr[0];
		cur =0;
		result ="";
		for(int i=1; i<arr.length; i++)
		{
			cur = arr[i];
			System.out.println(pre);
			if (arr[0] != 1 && arr[0]!=8)
			{
				result = "mixed";
				break;
			}
			
			System.out.println("test");
			
			if ( cur == pre+1 )
			{
				if(cur == 8)
				{
					result = "ascending";
					break;
				}
				pre = cur;						
			}
			
			else if ( cur == pre-1)
			{
				if( cur ==1)
				{
					result ="descending";
					break;
				}
				pre = cur;
				
			}
			
			else
			{
				result ="mixed";
				break;				
			}			
			
		}		
		System.out.println(result);		
		
	}

}
