import java.util.ArrayList;
import java.util.Scanner;
public class Ac_2747 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(),i=0;
		ArrayList<Integer> arr = new ArrayList();
		
		arr.add(0);
		arr.add(1);
		for(i=2; i<=n; i++)
		{
			arr.add(arr.get(i-2)+arr.get(i-1));
		}
		
		System.out.println(arr.get(i-1));	
	}
}
//Á¤´ä 
//