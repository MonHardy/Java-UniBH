package mypackage.aula5f_1v1;
import java.util.Scanner;
import java.io.*;
import java.text.DecimalFormat;

/**
 *
 * @author MonHardy
 * GitHub & Replit
 */

public class Aula5F_1v1 {

    /**
     * Exercício de Função Java -- Slide 5
     * O que você quer, o que vai entrar e como.
     */
    
    public static void main(String[] args) {
        
        // -------- Definição de variáveis --------
        
        double salario, imposto; 
        Scanner ler = new Scanner(System.in);
        
        // -------- Decimal -- https://docs.oracle.com/javase/7/docs/api/java/text/DecimalFormat.html --------
        
        DecimalFormat deci = new DecimalFormat("0.00");
        
        // -------- Entrada de dados --------
        
        System.out.println("Digite seu salário: ");
        salario = ler.nextDouble();
        
        // -------- Definição de função --------
        
        imposto=CalculaImposto(salario);
        
        // -------- Entrada de dados --------
        
        System.out.println("Você pagará em impostos: R$" + deci.format(imposto));   
    }
    
        // -------- Função --------
    
    public static double CalculaImposto(Double x){
        double desconto;
        desconto=x*0.14;
        
        // -------- Retorno de dado --------
        
        return desconto;
    }
}
