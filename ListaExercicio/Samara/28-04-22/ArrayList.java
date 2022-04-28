package samara.pkg28.pkg04;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

/* Faça um algoritmo que leia 5 números inteiro e armazene em um arraylist e 
mostre uma mensagem indicando se cada número é par ou ímpar, 
e se é positivo ou negativo.
*/

public class Samara2804 {

    public static void main(String[] args) {
        int quantidade, numeroUsuario, parImpar;
        Scanner ler = new Scanner(System.in);

        ArrayList<Integer> ListaNumeroUsuarios = new ArrayList<>();
        
        System.out.println("Digite a quantidade de números: ");
        quantidade = ler.nextInt();
        
        for(int i=1; i<=quantidade; i++){
        System.out.println("Digite os números desejados: ");
        numeroUsuario = ler.nextInt(); 
        
        ListaNumeroUsuarios.add(numeroUsuario);
        
        parImpar = numeroUsuario % 2;
        if (parImpar == 0){
            System.out.println("Esse número é Par");
        }else{
            System.out.println("Esse número é Ímpar");
            }
        if (numeroUsuario < 0){
            System.out.println("Esse número é Negativo \n");
        }else{
            System.out.println("Esse número é Positivo \n");
            }
        }      
    }
}
