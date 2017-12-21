import java.util.Scanner;

public class Ac_1085 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		int w = in.nextInt();
		int h = in.nextInt();
		
		System.out.println( Math.min(Math.min(Math.min(Math.abs(x-w), Math.abs(y-h)),x),y)  );
	}

}
