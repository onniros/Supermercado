public class Produto {

    private int id;
    private String nomeProduto;
    private double precoProduto;
    private int estoqueProduto;

    public String getNomeProduto() {
        return this.nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoProduto() {
        return this.precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public int getEstoqueProduto() {
        return this.estoqueProduto;
    }

    public void setEstoqueProduto(int estoqueProduto) {
        this.estoqueProduto = estoqueProduto;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Produto(int id) {
        this.id = id;

        switch (id) 
        {
            case 1: nomeProduto = "Pão";
                    precoProduto = 0.94;   
                    break;
            case 2: nomeProduto = "Requeijao";
                    precoProduto = 8.63;
                    break;
            case 3: nomeProduto = "Margarina com Sal";
                    precoProduto = 8.99;   
                    break;
            case 4: nomeProduto = "Margarina sem Sal";
                    precoProduto = 8.99;
                    break;

        }
    }
}  