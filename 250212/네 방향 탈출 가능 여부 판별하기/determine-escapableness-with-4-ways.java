
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
    private static class Node{
        int x,y;
        public Node(int x, int y){
            this.x = x;
            this.y = y;
        }


    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] map = new int[n][m];
        for(int i = 0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<m; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        ArrayDeque<Node> queue = new ArrayDeque<>();
        boolean[][] visited = new boolean[n][m];
        int[][] dist = new int[n][m]; // 거리정보
        queue.addLast(new Node(0,0));
        visited[0][0] = true;

        int[] dx = {-1,0,1,0};
        int[] dy = {0,1,0,-1};
        int result = 0;

        while( !queue.isEmpty()){
            Node now = queue.pollFirst();

            if(now.x == n-1 && now.y == m-1){
                result = 1;
                break;
            }

            for(int i = 0; i<4; i++){
                int nx = now.x+dx[i];
                int ny = now.y+dy[i];
                if(nx>=0&&nx<n&&ny>=0&&ny<m){
                    if(!visited[nx][ny]&&map[nx][ny] == 1){
                        visited[nx][ny] = true;
                        queue.addLast(new Node(nx,ny));
//                        dist[nx][ny]
                    }
                }
            }

        }
        System.out.println(result);
    }

}
