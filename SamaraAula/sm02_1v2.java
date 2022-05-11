/**
 * @author MonHardy
 */

package sn02_1v2;
import java.util.Scanner;
import java.io.*;

/**Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês, mais uma comissão
 * também fixa para cada carro vendido de 2% e mais 5% do valor das vendas total por ele fetuadas. Escrever um
 * algoritmo que leia o número de carros por ele vendidos, o valor total de suas vendas e o slaário. Escreva o 
 * salário final do vendedor.
 */

public class Sn02_1v2 {

    public static void main(String[] args) {
        
        double salariofixo, totaldasvendas, salariototal; int carrosvendidos;
        Scanner ler = new Scanner(System.in);
        
        /** 
         * salariofixo -- salário fixo do funcionário no mês
         * comissãofixa -- fixa do funcionário por mês para cada carro vendido (2%) 
         * totaldasvendas -- (5%) para o valor das vendas efetuadas
         * salariototal -- com todos os anteriores
         * carrosvendidos -- total de carros vendidos
         */
        
        System.out.println("Digite o número de carros vendidos pelo funcionário: ");
        carrosvendidos = ler.nextInt();
        
        System.out.println("Digite o valor total das vendas: ");
        totaldasvendas = ler.nextDouble();
        
        System.out.println("Digite o valor do seu salário fixo: ");
        salariofixo = ler.nextDouble();
        
        salariototal = (salariofixo * 0.02) * carrosvendidos + (totaldasvendas * 0.05) + salariofixo;
        
        
        System.out.println("O salário final do vendedor é: " + salariototal);
        
    }
    
}
