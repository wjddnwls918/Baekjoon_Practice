import java.util.Scanner;

public class Ac_4673 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		String tempstr="";
		int result=0;
		int temp=0;
		int arr[] = new int[10000];
		System.out.println("test");
		while ( result <= 10000)
		{
			System.out.println(n);
			temp += n;
			tempstr = Integer.toString(n);
			for(int i=0; i<tempstr.length(); i++)
			{
				temp += Integer.parseInt(""+tempstr.charAt(i));
			}
			result =temp;
			temp =0;
			n= result;
			
		}
		
	}

}
