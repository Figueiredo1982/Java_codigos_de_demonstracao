package pack; // Tenho que lembrar como utilizar o packge padrão

import java.util.Scanner;

public class Main {
    
    // Versão recursiva
    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor de n para calcular o n-ésimo número de Fibonacci: ");
        int n = scanner.nextInt();
        
        if (n < 0) {
            System.out.println("Por favor, insira um número não negativo.");
        } else {
            long resultado = fibonacci(n);
            System.out.println("O " + n + "º número de Fibonacci é: " + resultado);
        }
        
        scanner.close();
    }
}
