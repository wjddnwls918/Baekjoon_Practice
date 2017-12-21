import java.util.Scanner;

public class Ac_11720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner( System.in);
		int n = in.nextInt();
		in.nextLine();
		String num = in.next();
		int result=0;	
		for(int i=0; i<num.length(); i++)
		{
			result += Integer.parseInt(""+num.charAt(i));
		}
		System.out.println(result);
				
	}

}

//정답 , 코드길이, 속도 나쁘지않음 