package pack; // Lembrar que declaração de Package vem antes dos import
import java.util.Scanner; // Clássico import de scanner pra ler a entrada inputada no terminal

public class Main {
    
    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        
        long fib = 1;
        long prevFib = 1;
        
        for (int i = 2; i < n; i++) {
            long temp = fib;
            fib += prevFib;
            prevFib = temp;
        }
        
        return fib;
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