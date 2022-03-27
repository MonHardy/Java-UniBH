package sm03_1v2;
import java.util.Scanner;
import java.io.*;

/**
 * @author Monhardy
 * github.com/MonHardy
 * replit.com/@MonHardy
 */

public class Sm03_1v2 {

    /**
     * Escreva um algoritmo para cartas de baralho, com um valor que represente o valor da carta, de 1 (ás)
     * a 13 (rei), e outro valor correspondente ao naipe 1 = ouros, 2 = paus, 3 = copas e 4 = espadas
     * Retorne o nome da carta por extenso, por exemplo "2 de ouros", usando as instruções if e switch
     */
    public static void main(String[] args) {
        
        /*Variáveis*/
        int naipe, ncarta;
        Scanner input = new Scanner(System.in);
        
        /*Entrada de dados*/
        System.out.print("Informe a sua carta de 1 (ás) até 13 (rei): ");
        ncarta = input.nextInt();
        
        System.out.print("Escolha o naipe entre \n 1 - Ouros \n 2 - Paus \n 3 - Copas \n 4 - Espadas: \n");
        naipe = input.nextInt();
        
            /*Valor cartas*/
            if(ncarta == 1){System.out.print("Às");}
            if(ncarta == 11){System.out.print("Valente");}
            if(ncarta==12){System.out.print("Dama");}
            if(ncarta==13){System.out.print("Rei");}
            else{System.out.print(ncarta);}
            
            /*Naipe cartas*/    
        switch(naipe){
            case 1:
                naipe = 1;
                System.out.print(" de Ouros");
                break;
            case 2:    
                naipe = 2;
                System.out.print(" de Paus");
                break;
            case 3:
                naipe = 3;
                System.out.print(" de Copas");
                break;
            case 4:
                naipe = 4;
                System.out.print(" de Espadas");
                break;
                }    
    }
}
