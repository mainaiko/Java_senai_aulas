package AgoritmoCinquentaaeTres;

public class Aluno {

    private String curso;
    private String nome;
    private int ano;

    public Aluno(){};

    public Aluno(String curso, String nome, int ano){
        this.curso = curso;
        this.nome = nome;
        this.ano = ano;
    };

    public int getAno() {
        return ano;
    }
    public String getCurso() {
        return curso;
    }
    public String getNome() {
        return nome;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override 
    public String toString(){
        return "Nome:"+nome+" Curso: "+curso+" Ano: "+ano;
    }
}
