

import java.io.*;
import java.util.*;

public class Main {
	static int n, m;
	static int[][] map;
	static boolean[][] visited;
	static int result = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		map = new int[n][m];
		visited = new boolean[n][m];
		
		for(int i = 0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j<m; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		dfs(0,0);
        System.out.println(result);
		
	}
	
	public static void dfs(int x, int y) {
		
		if(x == n-1 && y==m-1) {
			result = 1;
			return;
		}
		
		int[] dx = {1,0};
		int[] dy = {0,1};
		
		
		for(int i = 0; i<2; i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			if(nx>=0&&nx<n&&ny>=0&&ny<m) {
				if(!visited[nx][ny]&&map[nx][ny] == 1) {
					visited[nx][ny] = true;
					dfs(nx,ny);
				}
				
			}
		}
	}
}
