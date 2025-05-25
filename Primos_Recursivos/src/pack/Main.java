package pack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    // Função recursiva para verificar se um número é primo
    public static boolean ehPrimo(int num, int divisor) {
        if (num <= 2) return (num == 2);
        if (num % divisor == 0) return false;
        if (divisor * divisor > num) return true;
        
        return ehPrimo(num, divisor + 2);
    }

    // Wrapper para empacotar a função ehPrimo
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        
        return ehPrimo(num, 3);
    }

    // Função recursiva para gerar a lista de primos
    public static void gerarPrimosRecursivo(int quantidade, List<Integer> primos, int candidato) {
        if (primos.size() >= quantidade) {
            return;
        }
        
        if (isPrime(candidato)) {
            primos.add(candidato);
        }
        
        gerarPrimosRecursivo(quantidade, primos, candidato + 1);
    }

    public static List<Integer> gerarPrimos(int quantidade) {
        List<Integer> primos = new ArrayList<>();
        if (quantidade > 0) {
            gerarPrimosRecursivo(quantidade, primos, 2);
        }
        return primos;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite quantos números primos deseja gerar em lista, mas não tente algo maior que 886, funções recursivas não são ''confiáveis'' : ");
        int n = scanner.nextInt();
        
        if (n <= 1) {
            System.out.println("N deve ser maior que 1  !!!");
        } else {
            List<Integer> listaPrimos = gerarPrimos(n);
            System.out.println("\nOs primeiros " + n + " números primos são:");
            
            for (int i = 0; i < listaPrimos.size(); i++) {
                System.out.printf("%3d ", listaPrimos.get(i));
                if ((i + 1) % 10 == 0) {
                    System.out.println();
                }
            }
        }
        
        scanner.close();
    }
}
