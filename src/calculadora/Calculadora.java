package calculadora;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.application.Platform.exit;

/**
 *
 * @author lczaikowski
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner escolha = new Scanner(System.in);
        Scanner calcula = new Scanner(System.in);
        Soma somador = new Soma();
        Dividir dividir = new Dividir();
        Subtracao subtrair = new Subtracao();
        Multiplicacao multiplica = new Multiplicacao();

        System.out.println("CALCULADORA");
        System.out.println("Somar ( 1 )");
        System.out.println("Dividir ( 2 )");
        System.out.println("Subtrair ( 3 )");
        System.out.println("Multiplicação ( 4 )");
        System.out.println("Sair ( 5 )");
        String x = null;
        x = escolha.nextLine();

        switch (x) {

            case "1":
                int num1,
                 num2;
                System.out.println("Digite 1 número: ");
                num1 = calcula.nextInt();

                System.out.println("Digite mais 1 número: ");
                num2 = calcula.nextInt();
                somador.soma(num1, num2);
                break;

            case "2":
                int numm1,
                 numm2;
                System.out.println("Digite 1 número: ");
                numm1 = calcula.nextInt();

                System.out.println("Digite mais 1 número: ");
                numm2 = calcula.nextInt();
                try {
                    dividir.divisao(numm1, numm2);
                } catch (Exception ex) {
                    Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;

            case "3":
                System.out.println("Digite 1 número: ");
                num1 = calcula.nextInt();

                System.out.println("Digite mais 1 número: ");
                num2 = calcula.nextInt();
                subtrair.subtrair(num1, num2);
                break;

            case "4":
                System.out.println("Digite 1 número: ");
                num1 = calcula.nextInt();

                System.out.println("Digite mais 1 número: ");
                num2 = calcula.nextInt();
                multiplica.multiplica(num1, num2);
                break;

            case "5":
                exit();
                break;

            default:
                System.out.println("Escolha inválida!!");
        }

    }

}
