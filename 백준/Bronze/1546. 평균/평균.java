import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double max = 0;
		double sum = 0;
		
		for(int i = 0; i < n; i++) {
			int score = sc.nextInt();
			sum += score;
			if(max < score) {
				max = score;
			}
		}
		double result = sum * 100 / max / n;
		System.out.println(result);
		
		sc.close();
	}
}