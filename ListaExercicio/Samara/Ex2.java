package exsamara2;
import java.util.Scanner;
import java.io.*;

/**
 * @author MonHardy
 */
public class ExSamara2 {

    public static void main(String[] args) {
        String moedas; Double valor, moeda;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe a moeda para a qual você deseja converter entre dolar, libra, euro e peso: ");
        moedas = ler.nextLine();
        
        System.out.println("Informe o valor: ");
        valor = ler.nextDouble();
        
        switch (moedas){
            
            case "dolar":
                moeda = (valor * 0.21);
                System.out.printf("Seu valor em dolar é: %.2f", moeda);
                break;
                
            case "libra":
                moeda = (valor * 95.06);
                System.out.printf("Seu valor em libras é: %.2f", moeda);
                break;
                
            case "euro":
                moeda = (valor * 0.19);
                System.out.printf("Seu valor em euro é: %.2f", moeda);
                break;
                
            case "peso":
                moeda = (valor * 23.75);
                System.out.printf("Seu valor em peso é: %.2f", moeda);
                break;
        }
    }   
}
