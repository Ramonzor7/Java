package Treinamentos;
import java.util.Scanner;

public class ComparativoNum {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        double num1;
        double num2;

        System.out.println("Digite dois números inteiros");
        num1 = leitor.nextDouble();
        num2 = leitor.nextDouble();
        
        if (num1==num2) {
            System.out.println("Os dois números que você digitou são iguais!");   
        }else if(num1!=num2 && num1>num2){
            System.out.println("Os dois números que você digitou são diferentes e o primeiro número digitado é maior!");
        }else if(num1!=num2 && num1<num2){
            System.out.println("Os dois números que você digitou são diferentes e o segundo número digitado é maior!");
        }
        leitor.close();
    }
}