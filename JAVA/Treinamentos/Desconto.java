package Treinamentos;
public class Desconto {
    public static void main(String[] args) {
        
        double precoOriginal = 100;
        double percentualDesconto = 10;
        double valorComDesconto = precoOriginal-(precoOriginal/percentualDesconto);
        System.out.println((int)valorComDesconto);
    }
}