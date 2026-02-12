import java.util.*;

public class Cliente {

    public static void main(String[] args) {
        
        Scanner menu = new Scanner(System.in);
        int escolha = 0;
        String nome = "Ramon Martins";
        Double Saldo = 1500.00;

        System.out.println("Seja bem vindo " +  nome + " Seu saldo atual é de " + String.format("%.0f", Saldo) + "R$");      
        
        while (escolha!=4) {
        
        System.out.println("Escolha uma opção a seguir:");
        System.out.println("1 - Realizar Depósito");
        System.out.println("2 - Realizar Transfêrencia");
        System.out.println("3 - Visualizar Saldo");
        System.out.println("4 -  Sair");
        escolha = menu.nextInt();

        if (escolha == 1) {
            System.out.println("Insira o valor a ser depositado em sua conta:");
            double Deposito = menu.nextDouble();
            
            System.out.println("Depósito concluído com sucesso!\n" + "Seu novo saldo é de:" +(Saldo+= Deposito));
        }
        else if (escolha==2) {
            System.out.println("Insira o valor a ser transferido:");
            double Transferencia = menu.nextDouble();
            if (Transferencia>Saldo) {
                System.out.println("Sua transferência não pode ser concluída, pois o valor é superior ao seu saldo");
            }else
            System.out.println("Transferência concluída com sucesso!\n" + "Seu novo saldo é de:" +(Saldo-= Transferencia));
        }
        else if (escolha==3) {
            System.out.println("Aqui está seu saldo:" + Saldo);
            
        }
        else if (escolha==4) {
            System.out.println("Tchau Tchau, até uma próxima!");
        }
            else if (escolha!=4) {
            System.out.println("Opção Inválida");
        }
        else
        menu.close();
    }
}
}