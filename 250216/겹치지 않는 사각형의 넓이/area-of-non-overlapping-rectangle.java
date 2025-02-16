
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] map = new int[2001][2001];
        int result = 0;
        StringTokenizer st;
        for(int i = 0; i<3; i++){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken()) + 1000;
            int y1 = Integer.parseInt(st.nextToken()) + 1000;
            int x2 = Integer.parseInt(st.nextToken()) + 1000;
            int y2 = Integer.parseInt(st.nextToken()) + 1000;

            for(int x = x1; x<x2; x++){
                for(int y = y1; y<y2; y++){
                    if(i == 2){
                        map[x][y] = 0;
                    } else {
                        map[x][y] =1;
                    }
                }
            }

        }

        for(int i = 0; i<2001; i++){
            for(int j = 0; j<2001; j++){
                if(map[i][j] == 1){
                    result++;
                }
            }
        }

        System.out.println(result);

    }
}
