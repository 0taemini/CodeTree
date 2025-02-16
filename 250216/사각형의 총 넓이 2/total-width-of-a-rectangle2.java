
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int sum = 0;
        int[][] map = new int[201][201];

        for(int i = 0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken()) +100;
            int y1 = Integer.parseInt(st.nextToken()) + 100;
            int x2 = Integer.parseInt(st.nextToken()) + 100;
            int y2 = Integer.parseInt(st.nextToken()) +100;
            for(int x = x1; x<x2; x++){
                for(int y = y1; y<y2; y++){
                    map[x][y] = 1;
                }
            }

        }


        for(int i = 0; i<201; i++){
            sum += Arrays.stream(map[i]).sum();
        }

        System.out.println(sum);
    }
}
