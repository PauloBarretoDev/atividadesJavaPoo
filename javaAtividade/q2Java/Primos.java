package q2Java;

public class Primos {
    int numero;
    int contadorDivisores;

    Primos(int numero) {
        this.numero = numero;
    }

    public boolean isPrimo(){
        for(int i = 1; i <=numero; i++){
            if(numero%i==0){
                contadorDivisores ++;
            }    
        }
        if(contadorDivisores==2){
            return true;
        }
        else return false;
    }
}
