package q3Java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a abcissa A:");
        double xA = scanner.nextInt();
        System.out.print("Informe a abcissa A:");
        double yA = scanner.nextInt();

        System.out.print("Informe a ordenada B:");
        double xB = scanner.nextInt();
        System.out.print("Informe a ordenada B:");
        double yB = scanner.nextInt();

        Ponto2D p = new Ponto2D(xA,yA,xB,yB);

        System.out.println("Distancia entre o ponto A e a origem: " + p.distanciaEntrePontoEOrigem());

        System.out.println("Distancia entre os pontos A e B: " + p.distanciaEntreDoisPontos()); 
        
        scanner.close();
    }
}
