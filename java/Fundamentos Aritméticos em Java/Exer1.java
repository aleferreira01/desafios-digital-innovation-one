import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class Exer1 {
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    
    Double[] valores = new Double[6];
    int positivos = 0;
    
    for (int i = 0; i < 6; i++){

      st = new StringTokenizer(br.readLine());
      valores[i] = Double.parseDouble(st.nextToken());
  
      if (valores[i] > 0){
          positivos++;
      }

    }
    
    System.out.println(positivos + " valores positivos");
  }
}
