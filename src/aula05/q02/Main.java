package aula05.q02;

public class Main {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("Lucca", 20);
        Vendedor v1 = new Vendedor("Maria");

        Pedido p1 = new Pedido(1, c1, v1);

        p1.mostrarPedido();
    }
}
