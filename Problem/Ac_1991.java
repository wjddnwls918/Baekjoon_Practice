import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_1991 {

	static int nodeCnt;
	static char node[][];

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		nodeCnt = Integer.parseInt(in.readLine());

		node = new char[nodeCnt][3];

		String temp[];
		for (int i = 0; i < nodeCnt; i++) {
			temp = in.readLine().split(" ");
			for (int j = 0; j < 3; j++) {
				node[i][j] = temp[j].charAt(0);
			}
		}
		
		preOrder(0);
		System.out.println();
		inOrder(0);
		System.out.println();
		postOrder(0);
		System.out.println();

	}

	public static void preOrder(int pos) {
		int leftPos = -1, rightPos = -1;

		for (int i = 0; i < nodeCnt; i++) {
			if (node[pos][1] != '.' && node[pos][1] == node[i][0])
				leftPos = i;

			if (node[pos][2] != '.' && node[pos][2] == node[i][0])
				rightPos = i;
		}

		
		System.out.print(node[pos][0]);
		if(leftPos != -1)
			preOrder(leftPos);
		if(rightPos != -1)
			preOrder(rightPos);
		
	}

	public static void inOrder(int pos) {
		int leftPos = -1, rightPos = -1;

		for (int i = 0; i < nodeCnt; i++) {
			if (node[pos][1] != '.' && node[pos][1] == node[i][0])
				leftPos = i;

			if (node[pos][2] != '.' && node[pos][2] == node[i][0])
				rightPos = i;
		}
		
		if(leftPos != -1)
			inOrder(leftPos);
		System.out.print(node[pos][0]);		
		if(rightPos != -1)
			inOrder(rightPos);
		
	}

	public static void postOrder(int pos) {
		int leftPos = -1, rightPos = -1;

		for (int i = 0; i < nodeCnt; i++) {
			if (node[pos][1] != '.' && node[pos][1] == node[i][0])
				leftPos = i;

			if (node[pos][2] != '.' && node[pos][2] == node[i][0])
				rightPos = i;
		}
		
		if(leftPos != -1)
			postOrder(leftPos);
		if(rightPos != -1)
			postOrder(rightPos);
		System.out.print(node[pos][0]);	
				
	}

}
