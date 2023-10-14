import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		 
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		
		int numCount = Integer.parseInt(stringTokenizer.nextToken());
		int sumCount = Integer.parseInt(stringTokenizer.nextToken());
		
		long[] sumArr = new long[numCount+1];

		stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		for(int i = 1; i <= numCount; i++) {
			sumArr[i] = sumArr[i-1] + Integer.parseInt(stringTokenizer.nextToken());
		}

		for(int k = 0; k < sumCount; k++){
			stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			int i = Integer.parseInt(stringTokenizer.nextToken());
			int j = Integer.parseInt(stringTokenizer.nextToken());
			System.out.println(sumArr[j] - sumArr[i-1]);
		}
		
		bufferedReader.close();
	}
}