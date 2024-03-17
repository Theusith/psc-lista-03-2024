import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leitura do indicador de operação e do raio
        System.out.println("Digite o Opção desejada:\n\n1. Calculo do perimetro do círculo");
        System.out.println("2. Calculo da áre do circulo");
        System.out.println("3. Calculo do colume da esfera");
        int operacao = sc.nextInt();
        System.out.println("Digite o raio:");
        double raio = sc.nextDouble();


        // Verificação e execução da operação
        switch (operacao) {
            case 1:
                double perimetro = 2 * Math.PI * raio;
                System.out.printf("Perímetro do círculo: %.2f ", perimetro);
                break;
            case 2:
                double area = Math.PI * Math.pow(raio, 2);
                System.out.printf("Área do círculo: %.2f", area);
                break;
            case 3:
                double volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
                System.out.printf("Volume da esfera: %.2f", volume);
                break;
            default:
                System.out.println("Código da operação inválido.");
        }
        // Fecha Scanner
        sc.close();
    }
}
