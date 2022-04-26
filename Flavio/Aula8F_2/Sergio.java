/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula8f_2;

/**
 *
 * @author monhardy
 */
public class Sergio extends Pessoa {
    @Override
    public void comer (String alimento)
    {
    if(alimento.equals("peixe") || alimento.equals("Peixe")) {
    System.out.println("Sérgio não gosta de peixe. Não vai comer.");
    }else{
    System.out.println("Bora comer " + alimento);
        }
    }
}
