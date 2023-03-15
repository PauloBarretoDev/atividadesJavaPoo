package q1Java;

public class Contador {
    int numero;

    public Contador(int numero) {
        this.numero = numero;
    }

    public void incrementar(){
        this.numero ++;
    }

    public void zerar(){
        this.numero = 0;
    }

    public int getNumero(){
        return numero;
    }
}
