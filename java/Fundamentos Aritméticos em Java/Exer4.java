import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Exer4 {

    static int soma = 0;
    static int restante = 0;
    static int valorEntrada = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        valorEntrada = Integer.parseInt(st.nextToken());
        
        int qtdNotasCem = 0;
        int qtdNotasCinquenta = 0;
        int qtdNotasVinte = 0;
        int qtdNotasDez = 0;
        int qtdNotasCinco = 0;
        int qtdNotasDois = 0;
        int qtdNotasUm = 0;
        int cont = 1;
        boolean calculoFinalizado = false;

        restante = valorEntrada;

        while(!calculoFinalizado){

            switch (cont){

                case 1: qtdNotasCem = restante / 100;
                    calcularResto(qtdNotasCem, 100);
                    break;

                case 2: qtdNotasCinquenta = restante / 50;
                    calcularResto(qtdNotasCinquenta, 50);
                    break;

                case 3: qtdNotasVinte = restante / 20;
                    calcularResto(qtdNotasVinte, 20);
                    break;

                case 4: qtdNotasDez = restante / 10;
                    calcularResto(qtdNotasDez, 10);
                    break;

                case 5: qtdNotasCinco = restante / 5;
                    calcularResto(qtdNotasCinco, 5);
                    break;

                case 6: qtdNotasDois = restante / 2;
                    calcularResto(qtdNotasDois, 2);
                    break;

                case 7: qtdNotasUm = restante / 1;
                    calcularResto(qtdNotasUm, 1);
                    break;

                default: calculoFinalizado = true;

            }

            cont++;

        }

        System.out.println(valorEntrada);
        System.out.println(qtdNotasCem + " nota(s) de R$ 100,00");
        System.out.println(qtdNotasCinquenta + " nota(s) de R$ 50,00");
        System.out.println(qtdNotasVinte + " nota(s) de R$ 20,00");
        System.out.println(qtdNotasDez + " nota(s) de R$ 10,00");
        System.out.println(qtdNotasCinco + " nota(s) de R$ 5,00");
        System.out.println(qtdNotasDois + " nota(s) de R$ 2,00");
        System.out.println(qtdNotasUm + " nota(s) de R$ 1,00");

    }

    private static void calcularResto(int qtdNotas, int tipoCedula){

        soma += qtdNotas * tipoCedula;
        restante = valorEntrada - soma;

    }
}
