package desafio;

public class Dicionario {

    private String laboratorio;
    private String descricao;
    private String dataRegistro; // Novo campo para atender a Capacidade 4

    public Dicionario(){}

    public Dicionario(String laboratorio, String descricao, String dataRegistro){
        this.laboratorio = laboratorio;
        this.descricao = descricao;
        this.dataRegistro = dataRegistro;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(String dataRegistro) {
        this.dataRegistro = dataRegistro;
    }
}