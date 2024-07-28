import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        if(n == 1){
            sb.append(br.readLine());
        } else{
            String[] arr = new String[n];
            for(int i = 0; i < n; i++){
                arr[i] = br.readLine();
            }
            for(int i = 0; i < arr[0].length(); i++){
                boolean a = true;
                char txt = arr[0].charAt(i);
                for(int j = 1; j < n; j++){
                    if(txt != arr[j].charAt(i)){
                        a = false;
                    }
                }
                if(a){
                    sb.append(txt);
                } else{
                    sb.append("?");
                }
            }
        }
        System.out.println(sb.toString());
    
    }
}
