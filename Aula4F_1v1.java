/*
 * Faça um software que receba um número inteiro e adicione 1 unidade, e que essa unidade seja adicionada 30 vezes.
 */
package mypackage.aula4f_1v1;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author monhardy
 * github.com/MonHardy/
 * replit.com/@MonHardy
 */
public class aula4F_1v1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
            int numero;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o número: ");numero = ler.nextInt();

        for(int i=0;i<30;++i){
            numero=numero+1;
            
        System.out.println("Digite o número com a adição de 1 unidade 30 vezes: " +numero);
            
    }
   }
}
