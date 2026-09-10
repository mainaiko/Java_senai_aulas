public class AlgoritmoVinteDoisAL {
    public static void main(String[] args){
        
        while(true){
        IO.println("Bem vindo");

        String usuario1 = "senai";
        int senha1 = 123;

        int teste_inicio = 1; 
        double valor_maximo_emprestimo = 20000;
        double valor_emprestimo_usuario;

        for(int i = 1; i<=3; i++){
            String usuario = IO.readln("digite o usuario: ");
            int senha = Integer.parseInt(IO.readln("digite a senha: "));

            if(!usuario.equals(usuario1) || senha != senha1){
            IO.println("errado tente novamente");
            teste_inicio++; 
            }else{
                IO.println("sucesso");
                break;
            }
        }
        
        if(teste_inicio == 3){
            IO.println("Seu cartao foi bloqueado fale com o gerente do estabelecimento");
            break;
        }else{
            IO.println("Valor maximo disponivel: R$20.000");
        }

        valor_emprestimo_usuario = Double.parseDouble(IO.readln("Qual o valor que deseja de emprestimo: "));

        if(valor_emprestimo_usuario <= valor_maximo_emprestimo){
            int quantidade_parcelas = Integer.parseInt(IO.readln("Digite a quantidade de parcelas: "));
            IO.println("Maximo de 10 parcelas");
            if(quantidade_parcelas != 0 && quantidade_parcelas <= 10){
                double valor_total_juros = (valor_emprestimo_usuario / quantidade_parcelas) * (0.01 * quantidade_parcelas);
                IO.println("O valor total das parcelas ficou em " + quantidade_parcelas + " " + valor_total_juros);
                IO.println("Paraabens voce acabou de receber o valor de " + valor_emprestimo_usuario + " creditado na sua conta");
            }else{
                IO.println("Valor maximo excedido");
                break;
            }
        }
    }
}
}





// qual senha e usuario
// nome e usuario corretos definidos anteriormente
// caso erre o nome ou a senha 3 vezes bloquear usuario e enviar ao gerente
// caso correto seguir para quanto deseja simular de emprestimo que é no maximo 20000