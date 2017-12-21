import java.util.Arrays;
import java.util.Scanner;

public class Ac_5543 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner in = new Scanner(System.in);
		int bur[] = new int[3];
		int bever[] = new int [2];
			
		for(int i=0; i<3; i++)
		{
			bur[i] = in.nextInt();
		}
		for(int i=0; i<2; i++)
		{
			bever[i] = in.nextInt();
		}
		
		Arrays.sort(bur);
		Arrays.sort(bever);
		
		System.out.println(bur[0]+bever[0]-50);

	}

}

//Á¤´ä 
