import java.util.Scanner;

public class Ac_2902 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String temp[] =str.split("-");
		
		for(int i=0; i<temp.length; i++)
			System.out.print(temp[i].charAt(0));
	}

}
//Á¤´ä 