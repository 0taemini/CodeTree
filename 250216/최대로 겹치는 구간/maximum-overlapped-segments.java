
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] result = new int[200];
        for(int i = 0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for(int j = x; j<y; j++){
                result[j] +=1;
            }
        }

        System.out.println(Arrays.stream(result).max().getAsInt());

    }
}
