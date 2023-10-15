import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		 
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		
	    int size = Integer.parseInt(stringTokenizer.nextToken());
	    int queryCount = Integer.parseInt(stringTokenizer.nextToken());
	    
	    int[][] array = new int[size+1][size + 1];
	    
	    for(int i = 1; i <= size; i++) {
	    	stringTokenizer = new StringTokenizer(bufferedReader.readLine());
	    	for(int j = 1; j <= size; j++) {
	    		array[i][j] = Integer.parseInt(stringTokenizer.nextToken());
	    	}
	    }
	    
	    int[][] sumArray = new int[size+1][size+1];
	    for(int i = 1; i <= size; i++) {
	    	for(int j = 1; j <= size; j++) {
	    		sumArray[i][j] = sumArray[i][j-1] + sumArray[i-1][j] - sumArray[i-1][j-1] + array[i][j];
	    	}
	    }
	    
	    for(int i = 0; i < queryCount; i++) {
	    	stringTokenizer = new StringTokenizer(bufferedReader.readLine());
	    	int x1 = Integer.parseInt(stringTokenizer.nextToken());
	    	int y1 = Integer.parseInt(stringTokenizer.nextToken());
	    	int x2 = Integer.parseInt(stringTokenizer.nextToken());
	    	int y2 = Integer.parseInt(stringTokenizer.nextToken());
	    	
	    	int result = sumArray[x2][y2]- sumArray[x1-1][y2] - sumArray[x2][y1-1] + sumArray[x1-1][y1-1];
	    	System.out.println(result);
	    }
		bufferedReader.close();
	}
}