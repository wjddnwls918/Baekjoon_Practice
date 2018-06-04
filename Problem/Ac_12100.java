import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
class Map{
	int map[][];
	int size;
	public Map(int input_map[][], int size){
		this.map=new int[size][size];
		this.map=input_map;
		this.size=size;
	}
}
public class Ac_12100 {
	static int MAX=-1;
	public static void main(String[] args) throws IOException{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token=new StringTokenizer(reader.readLine());
		int n=Integer.parseInt(token.nextToken());
		int board[][]=new int [n][n];
		for(int i=0;i<n;i++){
			token=new StringTokenizer(reader.readLine());
			for(int j=0;j<n;j++){
				board[i][j]=Integer.parseInt(token.nextToken());
				MAX=Math.max(MAX, board[i][j]);
			}
		}
		Map map=new Map(board,n);
		bfs(map);
		System.out.println(MAX);
	}
	
	//{up,right,down,left}
	static int dy[]={1,0,-1,0};
	//위로 슬라이드하면 위에서 아래로 돌아야하고
	//아래로 슬라이드하면 아래에서 위로 돌아야함
	static int dx[]={0,-1,0,1};

	public static void bfs(Map board){
		Queue<Map> q=new LinkedList<Map>();
		q.add(board);
		int count=0;
		while(!q.isEmpty()){
			count++;
			int size=q.size();
			if(count>5){
				break;
			}
			while(size-->0){
				Map m=q.poll(); 
				for(int i=0;i<4;i++){
					int temp[][]=new int[m.size][m.size];
					switch(i){
					case 0:
						for(int a=0;a<m.size;a++){
							int first_num=0;
							int second_num=0;
							int ti=a,tj=0;
							for(int b=0;b<m.size;b++){
								if(m.map[b][a]==0)
									continue;
								if(first_num==0){
									first_num=m.map[b][a];
								}else{
									second_num=m.map[b][a];
								}
								temp[tj][ti]=first_num;							
								if(second_num==0){
									continue;
								}
								if(first_num==second_num){
									temp[tj][ti]=first_num+second_num;
									MAX=Math.max(MAX, first_num+second_num);
									tj+=dy[i];ti+=dx[i];
									first_num=0;second_num=0;
								}else{
									tj+=dy[i];ti+=dx[i];
									temp[tj][ti]=second_num;
									first_num=second_num;
									second_num=0;
								}
							}
						}
						Map t1=new Map(temp,m.size);
						q.add(t1);
						break;

					case 1://right
						for(int a=0;a<m.size;a++){
							int first_num=0;
							int second_num=0;
							int ti=m.size-1,tj=a;
							for(int b=m.size-1;b>=0;b--){
								if(m.map[a][b]==0)
									continue;
								if(first_num==0){
									first_num=m.map[a][b];
								}else{
									second_num=m.map[a][b];
								}
								temp[tj][ti]=first_num;							
								if(second_num==0){
									continue;
								}
								if(first_num==second_num){
									temp[tj][ti]=first_num+second_num;
									MAX=Math.max(MAX, first_num+second_num);
									tj+=dy[i];ti+=dx[i];
									first_num=0;second_num=0;
								}else{
									tj+=dy[i];ti+=dx[i];
									temp[tj][ti]=second_num;
									first_num=second_num;
									second_num=0;
								}
							}
						}
						Map t2=new Map(temp,m.size);
						q.add(t2);
						break;

					case 2: //down 
						for(int a=0;a<m.size;a++){
							int first_num=0;
							int second_num=0;
							int ti=a,tj=m.size-1;
							for(int b=m.size-1;b>=0;b--){
								if(m.map[b][a]==0)
									continue;
								if(first_num==0){
									first_num=m.map[b][a];
								}else{
									second_num=m.map[b][a];
								}
								temp[tj][ti]=first_num;							
								if(second_num==0){
									continue;
								}
								if(first_num==second_num){
									temp[tj][ti]=first_num+second_num;
									MAX=Math.max(MAX, first_num+second_num);
									tj+=dy[i];ti+=dx[i];
									first_num=0;second_num=0;
								}else{
									tj+=dy[i];ti+=dx[i];
									temp[tj][ti]=second_num;
									first_num=second_num;
									second_num=0;
								}
							}
						}
						Map t3=new Map(temp,m.size);
						q.add(t3);
						break;

					case 3: //left
						for(int a=0;a<m.size;a++){
							int first_num=0;
							int second_num=0;
							int ti=0,tj=a;
							for(int b=0;b<m.size;b++){
								if(m.map[a][b]==0)
									continue;
								if(first_num==0){
									first_num=m.map[a][b];
								}else{
									second_num=m.map[a][b];
								}
								temp[tj][ti]=first_num;							
								if(second_num==0){
									continue;
								}
								if(first_num==second_num){
									temp[tj][ti]=first_num+second_num;
									MAX=Math.max(MAX, first_num+second_num);
									tj+=dy[i];ti+=dx[i];
									first_num=0;second_num=0;
								}else{
									tj+=dy[i];ti+=dx[i];
									temp[tj][ti]=second_num;
									first_num=second_num;
									second_num=0;
								}
							}
						}
						Map t4=new Map(temp,m.size);
						q.add(t4);
						break;
					}
				}
			}
		}
	}
}
