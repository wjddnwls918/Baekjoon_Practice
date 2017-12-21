import java.util.*;

public class Ac_10809 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str = in.next();
		int arr[] = new int[26];
		for(int i=0; i<arr.length; i++)
			arr[i] = -1;			
		for(int i=0; i<str.length(); i++)
		{
			if(arr[str.charAt(i)-97] !=-1)
				continue;
			arr[str.charAt(i)-97] = i;		
		}		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]);
			if(i!=arr.length-1)
				System.out.print(" ");
		}
	}

}
