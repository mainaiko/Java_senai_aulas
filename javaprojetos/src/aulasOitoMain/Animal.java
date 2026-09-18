package aulasOitoMain;

public abstract class Animal {
    protected String nome;
    protected String arquivoSom;

    public Animal(String nome, String arquivoSom){
        this.nome = nome;
        this.arquivoSom = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setArquivoSom(String arquivoSom) {
        this.arquivoSom = arquivoSom;
    }

    public String getArquivoSom() {
        return arquivoSom;
    }

    public String getNome() {
        return nome;
    }
 
    // contratos  --assinatura

    public abstract void comer();
    public abstract void tocarSom();

}
