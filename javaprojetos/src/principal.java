public class principal {
    public void main(){

        // objeto é a instancia de uma classe
        AlgoritmoTrintaeUm objeto = new AlgoritmoTrintaeUm();
        // classe -> objeto -> atribuição -> operador -> chamada construtor
        AlgoritmoTrintaeDois objeto2 = new AlgoritmoTrintaeDois();

        AlgoritmoTrintaeTre objeto3 = new AlgoritmoTrintaeTre();

        String nome = IO.readln("Qual o nome: ");

        IO.println(objeto.getAloMundo());
        objeto2.mostrarSalaEco("Natalia");
        objeto2.mostrarSalaEco(nome);

        objeto3.simbolo();
        
    }
}
