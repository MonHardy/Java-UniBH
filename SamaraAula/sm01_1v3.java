package sm01_1v3;
import java.util.Scanner;
import java.io.*;

public class Sm01_1v3 {

    public static void main(String[] args) {
        
    double nota1, nota2, nota3, somanota;
    String aluno1;
    Scanner ler = new Scanner(System.in);
        
    System.out.println("Digite o nome do aluno seguido por suas notas: ");
    aluno1 = ler.nextLine(); nota1 = ler.nextDouble(); nota2 = ler.nextDouble(); nota3 = ler.nextDouble(); 
    
    somanota = nota1 + nota2 + nota3;
    
    System.out.println("A soma de todas as notas do aluno " + aluno1 + " é " + somanota);
    
    }
    
}
