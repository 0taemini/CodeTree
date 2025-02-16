
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] map = new int[n];

        for(int i = 0; i<n; i++){
            map[i] = Integer.parseInt(br.readLine());
        }
        int cnt = 0;
        int result = Integer.MIN_VALUE;

        for(int i = 0; i<n; i++){
            if(i == 0 || map[i]==map[i-1]){
                cnt++;
            } else if(map[i]!=map[i-1]){
                result = Math.max(result, cnt);

            }
        }
        System.out.println(result);

    }
}
