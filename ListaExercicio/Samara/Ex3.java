package exsamara3;
import java.util.Scanner;
import java.io.*;

/**
 * @author Monhardy
 */

public class ExSamara3 {

    /** 2 primeiros anos:
     * pequena 12,5 (3 kg)
     * médio 10,5 (10 e 23)
     * grandes 9 (23kg + )
     * --------
     * Acima de dois:
     * 5,2 pequeno (3 kg)
     * 5,7 médio (10 e 23)
     * 7,8 grande (23kg + )
     */
    
    public static void main(String[] args) {
        Double peso; int idade;
        Double pequeno1, medio1, grande1, pequeno2, medio2, grande2;
        Scanner ler = new Scanner(System.in);
        

        System.out.println("Informe a idade do seu cachorro: ");
        idade = ler.nextInt();
        
        System.out.println("Informe o peso do seu cachorro: ");
        peso = ler.nextDouble();
       
       if (idade <= 2 && peso <= 3){
           pequeno1 = idade * 12.5;
           System.out.printf("A idade do cachorro em anos humanos é de:%.0f " , pequeno1);
       }
       else if(idade > 2 && peso <=3) {
           pequeno2 = (2 * 12.5) + ((idade - 2) * 5.2);
           System.out.printf("A idade de do cachorro em anos humanos é de:%.0f " , pequeno2);
       }
       
       if (idade <= 2 && peso >= 10 && peso <= 23){
           medio1 = idade * 10.5;
           System.out.printf("A idade de do cachrro em anos humanos é de:%.0f " , medio1);
       }
       else if (idade > 2 && peso >= 10 && peso <= 23) {
           medio2 = (2 * 10.5) + ((idade - 2) * 5.7);
           System.out.printf("A idade de do cachorro em anos humanos é de:%.0f " , medio2);
       }
       
       if (idade <= 2 && peso > 23){
           grande1 = idade * 9.0;
           System.out.printf("A idade de do cachorro em anos humanos é de:%.0f " , grande1);
       }
       else if (idade > 2 && peso > 23) {
           grande2 = (2 * 9) + ((idade - 2) * 7.8);
           System.out.printf("A idade de do cachorro em anos humanos é de:%.0f " , grande2);
       }else{}
    }   
}
