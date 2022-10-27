public class Item {
    private Produto produto;
    private int quantidade;

    public Item (int id, int quantidade) {
        produto = new Produto(id);
        this.quantidade = quantidade;
    }
    
    public Produto getProduto() {
        return this.produto;
    }

    public int getQuantidade() {
        return this.quantidade;
    }   

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}