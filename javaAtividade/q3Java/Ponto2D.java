package q3Java;
public class Ponto2D {
    double abcissaA;
    double ordenadaA;

    double abcissaB;
    double ordenadaB;

    public Ponto2D(){

    }

    public Ponto2D(double abcissaA, double ordenadaA, double abcissaB, double ordenadaB){
        this.abcissaA = abcissaA; // lado
        this.ordenadaA = ordenadaA; // cima

        this.abcissaB = abcissaB; // lado
        this.ordenadaB = ordenadaB; // cima
    }
    
    public double distanciaEntrePontoEOrigem(){
        double resultado;
        double x1 = abcissaA - 0;
        double x2= ordenadaA - 0;

        resultado = Math.sqrt((x1*x1) + (x2*x2));
        return resultado;
    }

    public double distanciaEntreDoisPontos(){
        double resultado;
        double x1 = abcissaA - abcissaB;
        double x2 = ordenadaA - ordenadaB;

        resultado = Math.sqrt((x1*x1)+(x2*x2));
        return resultado;
    }


}
