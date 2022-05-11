package sm03_1v4;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author MonHardy
 * github.com/MonHardy
 */
public class Sm03_1v4 {

    /**
     * fazer um somatório dos números de 0 a 10 em Java.
     */
    public static void main(String[] args) {
        int contador = 0;double soma = 0;
        
        while(contador < 10){
            soma+=contador;
            System.out.println(soma);
            contador++;
        }
        System.out.println("Soma = " + soma);
    } 
}
