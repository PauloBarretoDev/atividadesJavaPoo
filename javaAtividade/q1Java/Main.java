package q1Java;
public class Main{
    public static void main(String[] args) {
        
        Contador c = new Contador(8);

        System.out.println("Valor: " + c.getNumero());
        System.out.println("Incrementando o valor...");
        c.incrementar();
        System.out.println("Valor incrementado: "+c.getNumero());
        System.out.println("Zerando o valor... ");
        c.zerar();
        System.out.println("Valor zerado: "+c.getNumero());

    }
}
