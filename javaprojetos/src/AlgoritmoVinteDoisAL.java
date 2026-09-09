public class AlgoritmoVinteDoisAL {
    public static void main(String[] args){
        IO.println("Bem vindo");
        String usuario1 = "senai";
        int senha1 = 123;

            for(int i = 1; i<=3; i++){
                String usuario = IO.readln("digite o usuario: ");
                int senha = Integer.parseInt(IO.readln("digite a senha: "));

                if(!usuario.equals(usuario1) || senha != senha1){
                IO.println("errado tente novamente");
                }else{
                    IO.println("sucesso");
                    break;
                }
            }
            



    }
}


// qual senha e usuario
// nome e usuario corretos definidos anteriormente
// caso erre o nome ou a senha 3 vezes bloquear usuario e enviar ao gerente
// caso correto seguir para quanto deseja simular de emprestimo que é no maximo 20000