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
			
			//���ɷ� ��ȯ
			int newOne = curEmptyBottle/c;
			
			curEmptyBottle = curEmptyBottle%c;
			
			//��ȯ�Ұ� ������ ������
			if(newOne == 0)
				break;
			
			//���ο�� ī��Ʈ
			result += newOne;
			
			//���ο�ɷ� �󺴸����
			curEmptyBottle += newOne;			
		}
		
		System.out.println(result);
	}

}
