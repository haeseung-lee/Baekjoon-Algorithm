import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		int sumArr[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		for(int i = 1; i < n; i++) {
			int insertPoint = i;
			int insertValue = arr[i];
			
			for(int j = i-1; j >= 0; j--) {
				
				if(arr[j] < arr[i]) {
					insertPoint = j+1;
					break;
				}
				
				if(j==0) {
					insertPoint = 0;
				}
			}
			
			for(int j = i; j > insertPoint; j--) {
				arr[j] = arr[j-1];
			}
			arr[insertPoint] = insertValue;
		}
		
		sumArr[0] = arr[0];
		for(int i = 1; i < n; i++) {
			sumArr[i] = sumArr[i-1] + arr[i];
		}
		
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			sum = sum + sumArr[i];
		}
		System.out.println(sum);
	}
}