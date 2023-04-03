package Exercicio15;
import java.util.Scanner;
public class Exercicio15{
    public static void main(String[] args) {
        int numero;
        Scanner Ler = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        numero = Ler.nextInt();
        if ((numero>=100) && (numero<=200)){
            System.out.println(numero+" está entre 100 e 200");
        } else {  
            System.out.println(numero+" não esta entre 100 e 200");
        }
    } 
}