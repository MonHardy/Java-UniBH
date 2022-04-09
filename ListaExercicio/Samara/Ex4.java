package exsamara4;
import java.util.Scanner;
import java.io.*;
/**
 * @author Monhardy
 */

public class ExSamara4 {

    /**
     * Faça um algoritmo que leia um número inteiro e mostre uma mensagem 
     * indicando se este número é par ou ímpar, e se é poisitivo ou negativo
     */
    public static void main(String[] args) {
        int numero, resultado;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o número que você quer verificar: ");
        numero = ler.nextInt();
        
        resultado = numero % 2;
        
        if (resultado == 0){
                System.out.println("Esse número é par");
        }else{
                System.out.println("Esse número é ímpar");
        }    
    } 
}
