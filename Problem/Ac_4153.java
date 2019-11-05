import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_4153 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input[];

		while (true) {
			input = in.readLine().split(" ");
			int arr[] = new int[3];
			int max = 0;
			for (int i = 0; i < 3; i++) {
				if (max < Integer.parseInt(input[i])) {
					max = Integer.parseInt(input[i]);
				}
			}

			int k = 0;
			arr[2] = max;
			for (int i = 0; i < 3; i++) {
				if (Integer.parseInt(input[i]) != max) {
					arr[k] = Integer.parseInt(input[i]);
					k += 1;
				}
			}

			if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0)
				break;

			if (Math.pow(arr[0], 2) + Math.pow(arr[1], 2) == Math.pow(arr[2], 2)) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}

		}
	}

}
