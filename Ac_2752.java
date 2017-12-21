import java.util.Arrays;
import java.util.Scanner;

public class Ac_2752 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int arr[] = new int[3];
		for(int i=0; i<3; i++)
			arr[i] = in.nextInt();
		Arrays.sort(arr);
		for(int i=0; i<3; i++)
		{
			System.out.print(arr[i]);
			if(i <2)
				System.out.print(" ");
		}
	}

}

// Èì ..Á¤´ä