package calculadora;
/**
 *
 * @author lczaikowski
 */
public class Dividir {
    
        public int divisao(int numm1, int numm2) throws Exception{
        
            int tot = 0;
            if (numm1 == 0 || numm2 == 0) {
                throw new Exception("Divisão por 0");
            } else {
                tot = numm1 / numm2;
                System.out.println("Resultado da multiplicação: " + tot);
            }
            return 0;
        }
}
