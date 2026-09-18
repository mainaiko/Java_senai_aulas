public class principal {
    public void main(){

        // objeto é a instancia de uma classe
        AlgoritmoTrintaeUm objeto = new AlgoritmoTrintaeUm();
        // classe -> objeto -> atribuição -> operador -> chamada construtor
        AlgoritmoTrintaeDois objeto2 = new AlgoritmoTrintaeDois();

        AlgoritmoTrintaeTre objeto3 = new AlgoritmoTrintaeTre();
        // classe objeto = new Construtor();

        String nome = IO.readln("Qual o nome: ");

        IO.println(objeto.getAloMundo());


        objeto2.mostrarSalaEco("Natalia");
        objeto2.mostrarSalaEco(nome);

        objeto3.inserirChave(7);
        IO.println(objeto3.abrirPorta());

        AlgoritmoTrintaeQuatro alg34 = new AlgoritmoTrintaeQuatro();
        alg34.setSegundoNumero(1);



    }
}
