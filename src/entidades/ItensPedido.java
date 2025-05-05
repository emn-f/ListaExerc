package entidades;

public class ItensPedido {
    private Integer quantidade;
    private Double preco;

    private Produto produto;

    public ItensPedido(Integer quantidade, Double preco, Produto produto) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.produto = produto;
    }

    Integer getQuantidade() {
        return quantidade;
    }

    private void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    private Double getPreco() {
        return preco;
    }

    private void setPreco(Double preco) {
        this.preco = preco;
    }

    Produto getProduto() {
        return produto;
    }

    private void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Double subTotal() {
        return preco * quantidade;
    }

    @Override
    public String toString() {
        return produto.toString() +", Quantidade: " + quantidade + ", Subtotal: " + subTotal() + "\n";
    }

}
