package sm03_1v5;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author MonHardy
 * github.com/MonHardy
 */
public class Sm03_1v5 {

    /**
     * Construa um algoritmo para a tabuada - multiplicação de números de 1 a 10 (ex.: 1 x
     * 1 = 1, 1 x 2 = 2, etc.)
     */
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
              
            System.out.println("Digite um valor: ");
            n = input.nextInt();
            
         for(int i=0;i<=10;i++){
             System.out.println(n + "*" + i + "=" + (n * i) + "\n");
         }       
    }    
}
