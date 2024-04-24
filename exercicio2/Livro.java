public class Livro {
    
    private int id;
    private int ano;
    private String titulo;
    private String autor;

    public Livro(int id, String titulo, String autor, int ano){
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public int getId(){
        return this.id;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public String getAutor(){
        return this.autor;
    }
    public int getAno(){
        return this.ano;
    }

    public String exibirInfo(){
        return "Livro: "+this.titulo+" Autor: "+this.autor+" Ano: "+this.ano;
    }

}