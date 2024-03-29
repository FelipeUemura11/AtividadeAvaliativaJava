public class Jogador {
    private String nome;
    private int numJogador;
    private int pontos;
    private int nivel;

    public Jogador(int numJogador, String nome, int pontos, int nivel){
        this.numJogador = numJogador;
        this.nome = nome;
        this.pontos = pontos;
        this.nivel = nivel;
    }

    public int getNumJogador(){
        return this.numJogador;
    }

    public String getNome(){
        return this.nome;
    }

    public int getPontos(){
        return this.pontos;
    }

    public int getNivel(){
        return this.nivel;
    }

    public void setPontos(int novaPontuacao){
        this.pontos = novaPontuacao;
    }

    public void setNivel(int novoNivel){
        this.nivel = novoNivel;
    }

    public String exibirJogadores(){
        return "Numero do Jogador: "+ this.numJogador +" Nome: "+this.nome+" Pontos: "+this.pontos+" Nivel: "+this.nivel;
    }
}