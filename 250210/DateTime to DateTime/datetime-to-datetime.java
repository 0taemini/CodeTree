
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int result = 0;

        int month = 0;
        int bun = 0;

        if(a-11>0){
            month = (a-11)*24*60;
            bun = (b*60+c)-(11*60+11);
            result = month+bun;
        } else if (a==11) {
            bun = (b*60+c)-(11*60+11);
            result = bun;
            if(bun<0) result = -1;
            else result = bun;
        } else result = -1;

        System.out.println(result);


    }
}













