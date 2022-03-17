package sm01_1v1;
import java.util.Scanner;
import java.io.*;

public class Sm01_1v1 {

    public static void main(String[] args) {
        
        double altura, peso, imc;
        String nome;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o seu nome: ");
        nome = ler.nextLine();
        
        System.out.println("Digite a sua altura: ");
        altura = ler.nextDouble();
        
        System.out.println("Digite o seu peso: ");
        peso = ler.nextDouble();
        
        imc = peso / (altura * altura);
        
        System.out.println(nome + ", seu índice de massa corporal é: " + Math.ceil(imc));

    }
    
}
