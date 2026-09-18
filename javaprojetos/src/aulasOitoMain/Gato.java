package aulasOitoMain;

public class Gato extends Animal{

    public Gato(String nome, String tocarSom){
    super(nome, tocarSom);
    }

    public void comer(){
        IO.println("teste 1");
    }

    public void tocarSom(){
        IO.println("teste 2");
    }
}
