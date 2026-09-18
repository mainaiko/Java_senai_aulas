package aulasOitoMain;

public class AlgoritmoTrintaeSete extends Animal {
        public AlgoritmoTrintaeSete(String nome, String tocarSom){
    super(nome, tocarSom);
    }

    public void comer(){
        IO.println("teste 1");
    }

    public void tocarSom(){
        IO.println("teste 2");
    }
}
