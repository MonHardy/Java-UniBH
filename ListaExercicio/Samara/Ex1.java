package exsamara1;
import java.util.Scanner;
import java.io.*;

/**
 * @author MonHardy
 */

public class ExSamara1 {

    /**
     masculino (72.7 x h) - 58
     * feminino (62.1 x h) -44.7
     */
    public static void main(String[] args) {
        String sexo; Double altura, calculo;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe o seu sexo: ");
        sexo = ler.nextLine();
        
        System.out.println("Informe a sua altura: ");
        altura = ler.nextDouble();
        
        switch(sexo){
            case "feminino":
                calculo = (62.1 * altura) - 44.7;
                System.out.printf("Seu peso ideal é: %.2f\n ", calculo);
                break;
                
            case "masculino":
                calculo = (72.7 * altura) - 58;
                System.out.printf("Seu peso ideal é: %.2f\n ", calculo);
        }  
    }
}
