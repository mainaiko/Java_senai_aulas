public class Professor{
    private String nome;
    private int idade;
    private String escolaridade;

    public Professor(){

    }

    public Professor(String nome, int idade, String escolaridade){
        this.nome = nome;
        this.idade = idade;
        this.escolaridade = escolaridade;
    }

    public String getNome(){
        return nome;
    }

        public int getIdade(){
        return idade;
    }

        public String getEscolaridade(){
        return escolaridade;
    }

}


public class Laboratorio{  //ignore

    private String numero;
    private String tipo;

    //considerando os ambients do senai
    // sala
    // laboratorio
    // oficina
    // auditorio g
    // auditorio p

    // considerando os ambients do senai criar os construtores da classe ambiente e criar os metodos e get

    public Laboratorio(){

    }

    public Laboratorio(String numero, String tipo){
        this.numero = numero;
        this.tipo = tipo;
    }

    public String getNumero(){
        return numero;
    }

    public String getTipo(){
        return tipo;
    }
}