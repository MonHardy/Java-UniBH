package sm03_1v3;
import java.util.Scanner;
import java.io.*;

/**
 * @author MonHardy
 *github.com/MonHardy
 *replit.com/@MonHardy
 */

public class Sm03_1v3 {

    /**
     * Hands ON (Samara) - Fazer um programa para somar notas de um aluno, calcular a média e retornar.
     * Verifique se a média do aluno foi maior que 70 pontos e imprima "aprovado" se verdadeiro e "reprovado"
     * se falso.
     */
    
    public static void main(String[] args) {
        String nome;
        int alunos, media = 0, nota;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o quantidade de alunos: ");
        alunos = input.nextInt();
        
    while (media < alunos) {
        System.out.println("Digite a nota do aluno " + (media) + ":");
        nota=input.nextInt();
        if(nota >=70) {
            System.out.println("Aprovado!");
        }else {
            System.out.println("Reprovado!");
        }
        media++;
        }       
    }  
}
