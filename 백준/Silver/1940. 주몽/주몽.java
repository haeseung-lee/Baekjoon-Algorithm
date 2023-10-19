import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		 
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		int M = Integer.parseInt(bf.readLine());
	
		int[] NArr = new int[N];
	
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for(int i = 0; i < N; i++) {
			NArr[i] = Integer.parseInt(st.nextToken()); 
		}

		Arrays.sort(NArr);
		
		int count = 0;
		int i = 0;
		int j = N-1;
		
		while(i < j) {
			if(NArr[i] + NArr[j] < M) {
				i++;
			} else if(NArr[i] + NArr[j] > M) {
				j--;
			} else {
				count++;
				i++;
				j--;
			}
		}
		System.out.println(count);
		bf.close();
	}
}
