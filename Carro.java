public class Carro {
    private int id;
    private int ano;
    private int velocidadeAtual;
    private String placa;
    private String marca;
    private String modelo;

    public Carro(int id, String placa, String marca, String modelo, int ano, int velocidadeAtual){
        this.id = id;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = velocidadeAtual;
    }

    public int getId(){
        return this.id;
    }

    public String getPlaca(){
        return this.placa;
    }

    public String getMarca(){
        return this.marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public int getAno(){
        return this.ano;
    }

    public int getVelocidadeAtual(){
        return this.velocidadeAtual;
    }

    public void setAcelerar(double acelerar_porcento){
        this.velocidadeAtual += acelerar_porcento; 
    }

    public void setFrear(double frear_porcento){
        this.velocidadeAtual -= frear_porcento;
    }

    public String exibirCarros(){
        return "ID: "+id+ " Placa: "+this.placa+" Marca: "+this.marca+" Modelo: "+this.modelo+" Ano: "+this.ano+" Velocidade Atual: "+this.velocidadeAtual;
    }
    
}
