package Treinamentos;
import java.util.Scanner;

public class NumeroPosNeg {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double numDig;
        

        System.out.println("Digite um número aleatório:");
            numDig = leitura.nextInt();
                if (numDig>0) {
                    System.out.println("Número positivo");
                } 
                 else {
                    System.out.println("Número negativo");
            }
        leitura.close();          
        }
    }