public class Pedido {
    int idCliente;
    String saborPizza;
    String tamanhoPizza;
    String endCliente;
    float precoPizza;

    public Pedido(int idCliente, String saborPizza, String tamanhoPizza, String endCliente, float precoPizza){
        this.idCliente = idCliente;
        this.saborPizza = saborPizza;
        this.tamanhoPizza = tamanhoPizza;
        this.endCliente = endCliente;
        this.precoPizza = precoPizza;
    }

    public int getIdCliente(){
        return this.idCliente;
    }

    public String getSaborPizza(){
        return this.saborPizza;
    }

    public String getTamanhoPizza(){
        return this.tamanhoPizza;
    }

    public String getEndCliente(){
        return this.endCliente;
    }

    public float getPrecoPizza(){
        return this.precoPizza;
    }

    public String listaPedidos(){
        return "ID do cliente: "+idCliente+", Sabor da pizza: "+saborPizza+", Tamanho da pizza: "+tamanhoPizza+", Endereco do Cliente: "+endCliente+", Preco: "+precoPizza;
    }

}
