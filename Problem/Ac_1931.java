import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Ac_1931 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(in.readLine());
		ArrayList<Info> list = new ArrayList();
		String input[];
		int max = -1;
		for (int i = 0; i < N; i++) {
			input = in.readLine().split(" ");
			int s, d;
			s = Integer.parseInt(input[0]);
			d = Integer.parseInt(input[1]);

			if (s > max) {
				max = s;
			}

			list.add(new Info(s, d));
		}

		Collections.sort(list, new Comparator<Info>() {
			@Override
			public int compare(Info arg0, Info arg1) {
				
				if (arg0.s > arg1.s) {
					return 1;
				} else if (arg0.s == arg1.s) {
					if (arg0.d > arg1.d) {
						return 1;
					} else
						return -1;
				} else {
					return -1;
				}
			}
		});
		
		int result = -1;

		for (int curPnt = 0; curPnt <= max; curPnt++) {
			int point = curPnt;
			int tempCnt = 0;
			for(int i=0; i<list.size(); i++) {
				
				if (list.get(i).s > point) {
					//System.out.println("s : " + list.get(i).s + " d : " + list.get(i).d);
					point = list.get(i).d;
					tempCnt += 1;
				}
			}
			
			if(result < tempCnt) {
				result = tempCnt;
			}
			
		}

		System.out.println(result);
	}

	static class Info {
		int s, d;

		public Info(int s, int d) {
			this.s = s;
			this.d = d;
		}

	}

}
