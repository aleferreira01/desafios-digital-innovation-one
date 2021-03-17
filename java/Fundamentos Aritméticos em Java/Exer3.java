import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class Exer3 {
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    
    Double[] valores = new Double[5];
    int positivos = 0;
    int negativos = 0;
    int pares = 0;
    int impares = 0;
    
    for (int i = 0; i < valores.length; i++){

      st = new StringTokenizer(br.readLine());
      valores[i] = Double.parseDouble(st.nextToken());
  
      if (valores[i] > 0){
          positivos++;
      }
      if (valores[i] < 0){
          negativos++;
      }
      if (valores[i] % 2 == 0){
          pares++;
      }
      if (valores[i] % 2 != 0){
          impares++;
      }

    }
    
    System.out.println(pares + " valor(es) par(es)");
    System.out.println(impares + " valor(es) impar(es)");
    System.out.println(positivos + " valor(es) positivo(s)");
    System.out.println(negativos + " valor(es) negativo(s)");
  }
}
