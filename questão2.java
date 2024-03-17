import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Leitura do valor da compra
        System.out.print("Digite o valor da compra: R$ ");
        double valorCompra = sc.nextDouble();

        // Leitura do valor pago
        System.out.print("Digite o valor pago: R$ ");
        double valorPago = sc.nextDouble();

        // Verificação se o valor pago é suficiente para a compra
        if (valorPago < valorCompra) {
            System.out.println("Quantia paga é insuficiente para realizar a compra.");
            return;
        }

        // Cálculo do troco
        double troco = valorPago - valorCompra;
        System.out.println("Troco: R$ " + troco);

        // Cálculo do número mínimo de notas
        int notas50 = (int) (troco / 50);
        troco = troco % 50;

        int notas20 = (int) (troco / 20);
        troco = troco % 20;

        int notas10 = (int) (troco / 10);
        troco = troco % 10;

        int notas5 = (int) (troco / 5);
        troco = troco % 5;

        int notas2 = (int) (troco / 2);
        troco = troco % 2;

        int notas1 = (int) (troco / 1);

        // Exibição do número mínimo de notas
        System.out.println("Notas a serem devolvidas:");
        if (notas50 > 0) {
            System.out.println(notas50 + " nota(s) de R$ 50,00");
        }
        if (notas20 > 0) {
            System.out.println(notas20 + " nota(s) de R$ 20,00");
        }
        if (notas10 > 0) {
            System.out.println(notas10 + " nota(s) de R$ 10,00");
        }
        if (notas5 > 0) {
            System.out.println(notas5 + " nota(s) de R$ 5,00");
        }
        if (notas2 > 0) {
            System.out.println(notas2 + " nota(s) de R$ 2,00");
        }
        if (notas1 > 0) {
            System.out.println(notas1 + " nota(s) de R$ 1,00");
        }
        // fecha o Scanner
        sc.close()
    } 
}
