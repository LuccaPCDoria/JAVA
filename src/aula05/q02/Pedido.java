package aula05.q02;

public class Pedido {
    private int numero;
    private Cliente cliente;
    private Vendedor vendedor;

    public Pedido(int numero, Cliente cliente, Vendedor vendedor) {
        this.numero = numero;
        this.cliente = cliente;
        this.vendedor = vendedor;
    }

    public void mostrarPedido() {
        System.out.println("Pedido nº: " + numero);
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Vendedor: " + vendedor.getNome());
    }
}
