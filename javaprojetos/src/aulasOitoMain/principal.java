package aulasOitoMain;

public class principal {

    public void main(){
    Cachorro c = new Cachorro("luke", "au au");

    IO.println("nome: " + c.getNome());
    c.comer();
    c.tocarSom();

    AlgoritmoTrintaeOito porco = new AlgoritmoTrintaeOito("tomcat", "oinc");

    porco.tocarSom();


    }
}
