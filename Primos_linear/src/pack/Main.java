package pack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        
        // Verifica apenas até a raiz quadrada do número
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static List<Integer> gerarPrimosLinear(int quantidade) {
        List<Integer> primos = new ArrayList<>();
        int numero = 2; // Começa do primeiro número primo
        
        while (primos.size() < quantidade) {
            if (isPrime(numero)) {
                primos.add(numero);
            }
            numero++;
        }
        
        return primos;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite quantos números primos deseja gerar : ");
        int n = scanner.nextInt();
        
        //Verificação exigida 
        if (n <= 1) {
            System.out.println("N deve ser maior que 1");
        } else {
            List<Integer> listaPrimos = gerarPrimosLinear(n);
            System.out.println("\nOs primeiros " + n + " números primos são:");
            
            // Formatação bonitinha da saída
            for (int i = 0; i < listaPrimos.size(); i++) {
                System.out.printf("%3d ", listaPrimos.get(i));
                if ((i + 1) % 10 == 0) { // Quebra linha a cada 10 números
                    System.out.println();
                }
            }
        }
        
        scanner.close();
    }
}