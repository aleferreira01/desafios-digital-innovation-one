import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Exer2 {
	
    public static void main(String[] args) throws IOException {
      
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());

      int valor = Integer.parseInt(st.nextToken());

      for (int i = 0; i <= valor; i += 2){
        if (i > 0)
            System.out.println(i);
      }
    }	
}
