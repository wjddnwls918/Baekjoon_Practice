import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_5032 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input[];
		int e,f,c;
		input = in.readLine().split(" ");
		e = Integer.parseInt(input[0]);
		f = Integer.parseInt(input[1]);
		c = Integer.parseInt(input[2]);
		
		
		int result = 0;
		int curEmptyBottle = e+f;
		while(true) {
			
			//새걸로 교환
			int newOne = curEmptyBottle/c;
			
			curEmptyBottle = curEmptyBottle%c;
			
			//교환할게 없으면 끝나고
			if(newOne == 0)
				break;
			
			//새로운거 카운트
			result += newOne;
			
			//새로운걸로 빈병만들기
			curEmptyBottle += newOne;			
		}
		
		System.out.println(result);
	}

}
