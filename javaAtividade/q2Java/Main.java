package q2Java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor inteiro para verificar se o mesmo é primo: ");
        int numero = scanner.nextInt();

        Primos p = new Primos(numero);

        System.out.println(p.isPrimo());
        
        scanner.close();
    }
}
