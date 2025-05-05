package entidades;

import java.util.List;

import entidades.Enumeradas.StatusPedido;
import entidades.Produto;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private Date momento;
    private StatusPedido status;

    private List<ItensPedido> itens = new ArrayList<>();

    private Cliente cliente;

    public Pedido(Date momento, StatusPedido status, List<ItensPedido> itens, Cliente cliente) {
        this.momento = momento;
        this.status = status;
        this.itens = itens;
        this.cliente = cliente;
    }

    private Date getMomento() {
        return momento;
    }

    private void setMomento(Date momento) {
        this.momento = momento;
    }

    private StatusPedido getStatus() {
        return status;
    }

    private void setStatus(StatusPedido status) {
        this.status = status;
    }

    private List<ItensPedido> getItens() {
        return itens;
    }

    private void setItens(List<ItensPedido> itens) {
        this.itens = itens;
    }

    private Cliente getCliente() {
        return cliente;
    }

    private void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addItem(ItensPedido item) {
        itens.add(item);
    }

    public void removerItem(ItensPedido item) {
        itens.remove(item);

    }

    public Double total() {
        double soma = 0.0;
        for (ItensPedido item : itens) {
            soma += item.getProduto().getPreco() * item.getQuantidade();
        }
        return soma;
    }

    @Override
    public String toString() {
        return "RESUMO DO PEDIDO: \n" +
                "Momento do pedido: " + momento + "\n" +
                "Status do pedido: " + status + "\n" +
                "Cliente: " + cliente.getNome() + " (" + cliente.getDataNascimento() + ")\n" +
                "\n" +
                "ITENS DO PEDIDO\n" +
               itens.toString() + "\n" +
                "Valor Total: R$ " + total();
    }
}