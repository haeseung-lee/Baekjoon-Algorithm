import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		
		mData[] A = new mData[N];
		
		for(int i = 0; i < N; i++) {
			A[i] = new mData(Integer.parseInt(bf.readLine()), i);
		}
		
		Arrays.sort(A);
		
		int max = 0;
		
		for(int i = 0; i < N; i++) {
			if(max < A[i].index - i) {
				max = A[i].index - i;
			}
		}
		System.out.println(max + 1);
	}
	
}

class mData implements Comparable<mData>{

	int value;
	int index;

	public mData(int value, int index) {
		super();
		this.value = value;
		this.index = index;
	}

	@Override
	public int compareTo(mData o) {
		//value 기준 오름차순
		return this.value - o.value;
	}
	
}