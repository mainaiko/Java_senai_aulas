package AlgoritmoTrintaeOito;

public class Carro extends Veiculo {
    private int numPortas;

    public Carro(){
        super();
    }

    public Carro(String placa, int velocidadeMax, String tipoCombustivel, String cor, int numPortas){
        super(placa, velocidadeMax, tipoCombustivel, cor);
        this.numPortas = numPortas;
    }

    @Override
    public void mover(){
        IO.println("O carro se moveu");
    }
}
