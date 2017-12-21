import java.util.*;
public class Ac_1152 {

	public static void main(String[] args) {
	
		String str;
		Scanner in = new Scanner(System.in);		 
		str = in.nextLine();
		String arr[] = str.split(" ");
		int cnt=0;
		/*for(int i=0; i<arr.length; i++)
			System.out.println(arr[i]);
*/
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i].equals(""))
				continue;
			cnt++;
		}
		
		System.out.println(cnt);
	}

}

//실수 길이나 속도도 나쁘지 않음 
