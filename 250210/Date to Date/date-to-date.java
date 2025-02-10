
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int m1 = Integer.parseInt(st.nextToken());
        int d1 = Integer.parseInt(st.nextToken());
        int m2 = Integer.parseInt(st.nextToken());
        int d2 = Integer.parseInt(st.nextToken());


        int[] months = {31,28,31,30,31,30,31,31,30,31,30, 31};

        int m1Cnt = d1;
        int m2Cnt = d2;
        for(int i = 0; i<m1; i++){
            m1Cnt += months[i];
        }
        for(int i = 0; i<m2; i++){
            m2Cnt += months[i];
        }
        System.out.println(m2Cnt-m1Cnt);


    }
}













