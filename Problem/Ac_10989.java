import java.util.Arrays;
import java.util.Scanner;

public class Ac_10989 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int [n];
		for(int i=0; i<n; i++)
			arr[i] = in.nextInt();
		Arrays.sort(arr);
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i]);
			if(i < n-1)
				System.out.println();
		}
		
	}

}
