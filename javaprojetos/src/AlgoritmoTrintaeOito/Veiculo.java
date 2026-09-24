package AlgoritmoTrintaeOito;

public abstract class Veiculo {
    private String placa;
    private int velocidadeMax;
    private String tipoCombustivel;
    private String cor;

    public Veiculo(){

    }

    // construtor
    public Veiculo(String placa, int velocidadeMax, String tipoCombustivel, String cor) {
        this.placa = placa;
        this.velocidadeMax = velocidadeMax;
        this.tipoCombustivel = tipoCombustivel;
        this.cor = cor;
    }

    // get e set
    public String getCor() {
        return cor;
    }
    public String getPlaca() {
        return placa;
    }
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }
    public int getVelocidadeMax() {
        return velocidadeMax;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
    public void setVelocidadeMax(int velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    // exemplo de polimorfismo
    public abstract void mover();

}
