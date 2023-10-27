import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Main{
	
	public static void main(String[] args) throws NumberFormatException, IOException {
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		Queue<Integer> que = new LinkedList<>();
		for(int i = 1; i <= n; i++) {
			que.add(i);
		};
		
		while(que.size() > 1) {
			que.poll();
			que.add(que.poll());
		}
		System.out.println(que.poll());
	}
}