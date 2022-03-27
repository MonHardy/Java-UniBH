package sm03_1v1;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author MonHardy
 * github/MonHardy
 * replit.com/@MonHardy
 */

public class Sm03_1v1 {

    /**
     * Escreva um programa que determina o salário total de 3 cargos de uma empresa que vende 3 tipos de produtos. O salário do vendedor é R$ 1200.00,
     * do caixa é R$1800,00 e do gerente é R$2500,00. Os funcionários recebem uma porcentagem diferente de comissão para cada tipo de produto de acordo
     * com o cargo (Tabela). Receba a quantidade dos produtos para calcular o salário. O usuário deve conseguir escolher para qual cargo ele deseja saber
     * o salário.
     */
    
    public static void main(String[] args) {
        
        /*Variáveis*/
        String cargo;
        double salario=0;
        int produto, cod, quantidade;
        
        /*Criar objeto*/
        Scanner ler = new Scanner(System.in);
        
        /*Entrada de dados*/
        System.out.println("Informe o cargo do funcionário: ");
        cargo = ler.next();
        
        System.out.println("Informe o código do produto que foi vendido: 1, 2 ou 3");
        cod = ler.nextInt();
        
        System.out.println("Inform a quantidade do produto: ");
        quantidade = ler.nextInt();
        
        
        switch(cargo){
            case "vendedor": 
                switch(cod){
                
                case 1:
                        salario = 1200 + (20.9*quantidade)*0.03;
                case 2:
                        salario = 1200 + (59.9*quantidade)*0.04; 
                case 3:
                        salario = 1200 + (99.9*quantidade)*0.05;
                        break;
        }
         break;
            case "caixa":
                switch(cod){
                    
                case 1:
                salario = 1800 + (20.9*quantidade)*0.005;
                
                case 2:
                salario = 1800 + (59.9*quantidade)*0.01;
                
                case 3:
                salario = 1800 + (99.9*quantidade)*0.015;
                break;
                }
                
            case "gerente":
                switch(cod){
                
                case 1:
                salario = 2500 + (20.9*quantidade)*0.01;
                
                case 2:
                salario = 2500 + (59.9*quantidade)*0.015;
                
                case 3:
                salario = 2500 + (99.9*quantidade)*0.02;
                break;
                }
             break;   
            default:
                System.out.println("Informe um cargo válido: ");  
        }
        System.out.println("O salário é igual a: " +salario);
    }
}
