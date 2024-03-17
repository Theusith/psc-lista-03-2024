import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Leitura dos coeficientes
        System.out.println("Digite os coeficientes da equação de segundo grau:");
        System.out.print("a: ");
        double a = sc.nextDouble();
        System.out.print("b: ");
        double b = sc.nextDouble();
        System.out.print("c: ");
        double c = sc.nextDouble();

        // Verificação dos coeficientes
        if (a == 0 && b == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente.");
        }

        // Cálculo de delta
        double delta = b * b - 4 * a * c;

        // Verificação das raizes 
        if (delta < 0) {
            System.out.println("Esta equação não possui raízes reais.");
        } else if (delta == 0) {
            System.out.println("Esta equação possui duas raízes reais iguais.");
            double raiz = -b / (2 * a);
            System.out.println("Valor da raiz real: " + raiz);
        } else {
            System.out.println("Esta equação possui duas raízes reais diferentes.");
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Valor das raízes reais: " + raiz1 + " e " + raiz2);
        }
        // Fecha o Scanner
        sc.close();
        
    }
}
