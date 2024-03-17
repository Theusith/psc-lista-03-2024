/* Escreva um programa que calcule o teorema de Pitágoras, representado pela expressão: c =a2+b2 .*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1, valor2, valor3, maior, menor;
        double mediaAritimetica;

        System.out.println("Digite o primeiro valor:");
        valor1 = sc.nextInt();

        System.out.println("Digite o segundo valor:");
        valor2 = sc.nextInt();

        System.out.println("Digite o terceiro valor:");
        valor3 = sc.nextInt();
        
        // Define o maior numero
        if (valor1 > valor2 && valor1 > valor3){
            maior = valor1;
        } else if (valor2 > valor1 && valor2 > valor3) {
            maior = valor2;
        } else {
            maior = valor3;
        }
        // Define o menor numero
        if (valor1 < valor2 && valor1 < valor3){
            menor = valor1;
        } else if (valor2 < valor1 && valor2 < valor3) {
            menor = valor2;
        } else {
            menor = valor3;
        }


        mediaAritimetica = (valor1 + valor2 + valor3) / 3;
        System.out.println("O maior numero é: " + maior);
        System.out.println("O menor numero é: " + menor);
        System.out.printf("A méria aritimética dos tres numeros é: %.2f ", mediaAritimetica );


        sc.close();

    }

}
