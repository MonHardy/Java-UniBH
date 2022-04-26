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
public class Pessoa {
    String nome;
    int idade;
    public void setNome(String nome){ this.nome=nome;}
    public String getNome(){ return nome;}
    
    public void setIdade(int idade) { this.idade=idade;}
    public int getIdade() { return idade;}
    
    public Pessoa(){
    }
    public void comer (String alimento){
        System.out.println("Pessoa comendo " + alimento);
    }
}
