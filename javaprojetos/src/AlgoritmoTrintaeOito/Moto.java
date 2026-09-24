package AlgoritmoTrintaeOito;

public class Moto extends Veiculo implements IManutencao{
    private Boolean temBau;

    public Moto(){
        super();
    }

    public Moto(String placa, int velocidadeMax, String tipoCombustivel, String cor, Boolean temBau){
        super(placa, velocidadeMax, tipoCombustivel, cor);
        this.temBau = temBau;
    }
    // sobreescrita do metodo abstrado em que delarei soment a existencia na classe abstrata veiculo
    
    @Override
    public void mover(){
        IO.println("A moto se moveu");
    }

    @Override
    public void revisaoProgramada() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'revisaoProgramada'");
    }
}
