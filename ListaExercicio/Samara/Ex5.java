package exsamara5;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author Mon
 */
public class ExSamara5 {

    /**
     * <= 1000 --- 20%
     * > 1000 <= 2000 --- 28%
     * > 2000 < 4000 --- 15%
     * > 4000 ---- 10%
     */
    public static void main(String[] args) {
        double salario, mil, mil2, mil3, mil4;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe o seu salário: ");
        salario = ler.nextDouble();
        
        if (salario <= 1000){
            mil = (salario * 0.2) + salario;
            System.out.println("O seu salário é: " + mil);
        }else if (salario > 1000 && salario <= 2000){
            mil2 = (salario * 0.28) + salario;
            System.out.println("O seu salário é: " + mil2);
        }else if (salario > 2000 && salario <= 4000){
            mil3 = (salario * 0.15) + salario;
            System.out.println("O seu salário é: " + mil3);
        }else if (salario > 4000){
            mil4 = (salario * 0.1) + salario;
            System.out.println("O seu salário é: " + mil4);
        } 
    }
}
