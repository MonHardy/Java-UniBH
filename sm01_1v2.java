package sm02_1v2;
import java.util.Scanner;
import java.io.*;


public class Sm02_1v2 {

    public static void main(String[] args) {
        // TODO code application logic here
    double altura1, altura2, altura3, altura4, media;
    Scanner ler = new Scanner(System.in);

    System.out.println("Digite as alturas: ");
    altura1 = ler.nextDouble(); altura2 = ler.nextDouble(); altura3 = ler.nextDouble(); altura4 = ler.nextDouble();

    media = (altura1 + altura2 + altura3 + altura4) / 4;

    System.out.println("A média de altura do grupo é: "+ media); 
    }
    
}
