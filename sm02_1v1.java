 /* @author MonHardy */

package sm02_1v1;
import java.util.Scanner;
import java.io.*;

/**
 1 - Faça um algoritmo para ler: a descrição do produto(nome), a quantidade adquirida e o preço unitário.
 * Calcular e escrever o total (total = quantidade adquirida * preço unitário), o desconto e o total a pagar
 * (total a pagasr = total - desconto), sabendo que:
 * - Se quantidade <= 5, o desconto será de 2%
 * - Se quantidade > 5 e quantidade <=10, o desconto será de 3%
 * - Se quantidade > 10 e quantidade <30, o desconto será de 5%
 * - Se quantidade >= 30 o desconto será de 10%
 */

public class Sm02_1v1 {
 
    public static void main(String[] args) {
      
        String nome;
        int quantidade;
        float preço, total;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o nome do produto: ");
        nome = ler.next();
        
        System.out.println("Digite a quantidade: ");
        quantidade = ler.nextInt();
        
        System.out.println("Digite o preço do produto: ");
        preço = ler.nextFloat();
        
        total = quantidade * preço;
        System.out.println("Total igual a: "+total);
        
        if (quantidade<=5){
            total = total *0.98f;      
        }
        else if ((quantidade>5)&&(quantidade<=10)){
            total = total *0.97f;
        }
        else if ((quantidade>10)&&(quantidade<=30)){
            total = total * 0.95f;
        } 
        else {
            total = total * 0.90f;
        }
        System.out.println("O total com desconto é: " +total);
        
    }
    
}
