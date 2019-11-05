import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_3023 {

	static int R, C, A, B;
	static char map[][];

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder out = new StringBuilder();
		String input[];
		input = in.readLine().split(" ");

		R = Integer.parseInt(input[0]);
		C = Integer.parseInt(input[1]);

		map = new char[R][C];

		String str;
		for (int i = 0; i < R; i++) {
			str = in.readLine();
			for (int j = 0; j < C; j++) {
				map[i][j] = str.charAt(j);
			}
		}

		input = in.readLine().split(" ");
		A = Integer.parseInt(input[0]);
		B = Integer.parseInt(input[1]);

		char first[][] = garo(map);
		
		System.out.println("first");
		for (int i = 0; i < first.length; i++) {
			for (int j = 0; j < first[i].length; j++) {

				System.out.println(first[i][j]);
				
				if (j == first.length - 1)
					System.out.println();
			}
		}
		System.out.println();
		
		char second[][] = sero(first);
		
		
		System.out.println("second");
		for (int i = 0; i < second.length; i++) {
			for (int j = 0; j < second[i].length; j++) {

				System.out.println(second[i][j]);
				
				if (j == second.length - 1)
					System.out.println();
			}
		}
		System.out.println();
		
		
		char third[][] = sero(map);
		
		System.out.println("third");
		for (int i = 0; i < third.length; i++) {
			for (int j = 0; j < third[i].length; j++) {

				System.out.println(third[i][j]);
				
				if (j == third.length - 1)
					System.out.println();
			}
		}
		System.out.println();
		

		char resultMap[][] = new char[R * 2][C * 2];

		// 왼위
		fillMap(resultMap, map, 0, 0);

		// 오른위
		fillMap(resultMap, first, C, 0);

		// 오른 아래
		fillMap(resultMap, second, C, R);

		// 왼 아래
		fillMap(resultMap, third, 0, R);

		for (int i = 0; i < resultMap.length; i++) {
			for (int j = 0; j < resultMap[i].length; j++) {

				if (i == (A-1) && j == (B-1)) {
					if(resultMap[i][j] == '.')
						out.append("#");
					else
						out.append(".");
				} else
					out.append(resultMap[i][j]);
				
				if (j == resultMap.length - 1)
					out.append("\n");
			}
		}
		
		System.out.println(out);

	}

	public static void fillMap(char dst[][], char src[][], int x, int y) {

		int k = 0;
		for (int i = y; i < y + R; i++) {
			int l = 0;
			for (int j = x; j < x + C; j++) {
				dst[i][j] = src[k][l];
				l += 1;
			}
			k += 1;
		}
	}

	public static char[][] garo(char map[][]) {

		char newMap[][] = new char[R][C];

		int k = 0;
		for (int i = 0; i < R; i++) {
			int l = 0;
			for (int j = C - 1; j >= 0; j--) {
				newMap[k][l] = map[i][j];
				l += 1;
			}
			k += 1;
		}

		return newMap;
	}

	public static char[][] sero(char map[][]) {
		char newMap[][] = new char[R][C];

		int k = 0;
		for (int i = 0; i < C; i++) {
			int l = 0;
			for (int j = map.length - 1; j >= 0; j--) {
				newMap[l][k] = map[i][j];
				l += 1;
			}
			k += 1;
		}

		return newMap;
	}

}
