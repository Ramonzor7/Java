package Treinamentos;
import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int numero = scanner.nextInt();
        
        if (numero%2==1) {
            System.out.println("Número ímpar");
        }else{
            System.out.println("Número Par");
        }
        scanner.close();
    }
}