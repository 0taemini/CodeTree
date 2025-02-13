
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 0; t<T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String commend = st.nextToken();
			
			switch (commend) {
			case "push":
				pq.add(Integer.parseInt(st.nextToken()));
				break;
				
			case "pop":
				System.out.println(pq.poll()); 
				break;
				
			case "size":
				System.out.println(pq.size());
				break;
			case "empty":
				if(pq.isEmpty()) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}break;
				
			case "top":
				System.out.println(pq.peek());
				break;
			default:
				break;
			}
		}
		
		
		
	}
	
	

}
