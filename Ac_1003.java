import java.util.Scanner;

public class Ac_1003 {

	public static int num1 =0;
	public static int num2 =0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int arr[] = new int[num];
		for(int i=0; i<num; i++)
			arr[i] = in.nextInt();
		
		
		for(int i=0; i<num; i++)
		{
			fib(arr[i]);
			
			System.out.println(num1 + " " +num2);			
			num1=0;
			num2=0;
		}
		
	}

	public static int fib(int n)
	{
		if (n ==0)
		{
			num1++;
			return 0;
		}
		else if(n ==1)
		{
			num2++;
			return 1;
		}
		else
		{
			return fib(n-1) + fib(n-2);
		}
	}
}

//성공  인데 코드길이는 짧은편인데 메모리랑 속도가 조금 걸리네 
