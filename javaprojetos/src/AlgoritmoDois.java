public class AlgoritmoDois {

    void main(){
        //Entrada
        IO.println("Teste 1");
        String usuario = IO.readln("Digite o teste: ");
        IO.println("Teste: " + usuario + "executado");
        //int estrelas = 0;
        //Integer.parseInt(valor para convercao);
        int estrelas = 0;
        //todas as entradas sao string, é preciso converter
        int resp = Integer.parseInt(IO.readln("Digite um numero: "));

        if(resp == 1){
            IO.println("Correto");
            //++ incrementa 1
            estrelas = estrelas++;
        }else{
            IO.println("Errado");
        }
        IO.println("Voce agora tem: " + estrelas + "estrelas");
    }
    
}
