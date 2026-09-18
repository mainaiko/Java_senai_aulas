class AlgoritmoTrintaeTre{
    private int simbolo; // atributo
    // atributos privados e metodos publicos
    // classe = atributo privado
    // private é um paradigma de de encapsulamento

    public void inserirChave(int s){
        simbolo = s;
    }

    public int retornarChave(){
        return simbolo;
    }

    public String abrirPorta(){
        String resposta;
        if (simbolo == 7){
            resposta = "A porta verde-agua se abre";
        }else{
            resposta = "A porta de cobre se abre";
        };
        return resposta;
    }
}