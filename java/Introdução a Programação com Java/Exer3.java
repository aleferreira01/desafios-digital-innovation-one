import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class Exer3 {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int value1 = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    int value2 = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    double value3 = Double.parseDouble(st.nextToken());

    double salary = value2 * value3; 

    System.out.println("NUMBER = " + value1);
    System.out.printf("SALARY = U$ %.2f", salary);
  }
}
