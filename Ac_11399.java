import java.util.*;
import java.util.Arrays;
public class Ac_11399 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner in = new Scanner(System.in);
	        int n,temp=0,result=0;
	        n = in.nextInt();
	        int arr[] = new int[n];
	        	                
	        for(int i=0; i<n; i++)
	        	arr[i] = in.nextInt();
	        
	        Arrays.sort(arr);
	        	        
	        for(int i=0; i<n; i++)
	        {
	        	temp += arr[i];	 	        	
	        	result+=temp;
	        }
	        
	        
	}

}
