public class Produto {
    private String nomeProduto;
    private int idProduto;
    private int quantProduto;
    private double precoProduto;

    public Produto(String nomeProduto, int idProduto, int quantProduto, double precoProduto){
        this.nomeProduto = nomeProduto;
        this.idProduto = idProduto;
        this.quantProduto = quantProduto;
        this.precoProduto = precoProduto;
    }

    public String getNomeProduto(){
        return this.nomeProduto;
    }

    public int getIdProduto(){
        return this.idProduto;
    }

    public int getQuantProduto(){
        return this.quantProduto;
    }

    public double getPrecoProduto(){
        return this.precoProduto;
    }

    public void setNomeProduto(String novoNome){
        this.nomeProduto = novoNome;
    }
    public void setIdProduto(int novoId){
        this.idProduto = novoId;
    }
    public void setQuantProduto(int novoQuant){
        this.quantProduto = novoQuant;
    }
    public void setPrecoProduto(double novoPreco){
        this.precoProduto = novoPreco;
    }

    public String listaEstoque(){
        return "Nome do produto: "+this.nomeProduto+" ID: "+this.idProduto+" Quantia: "+this.quantProduto+" Preco: R$"+this.precoProduto;
    }

}
