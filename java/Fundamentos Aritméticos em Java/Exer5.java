import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class Exer5 {

    //private static DecimalFormat df3 = new DecimalFormat("#.###");

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        try{

            int distanciaTotal = Integer.parseInt(st.nextToken());
            double totalCombustivel = Double.parseDouble(st2.nextToken());

            //df3.setRoundingMode(RoundingMode.UP);
            Double consumoMedio = distanciaTotal / totalCombustivel;

            //String strConsumoMedio = df3.format(consumoMedio);

            System.out.println(String.format("%.3f", consumoMedio) + " km/l");
        }
        catch (Exception e){
            System.out.println("Entre com um valor inteiro");
        }

    }
}
