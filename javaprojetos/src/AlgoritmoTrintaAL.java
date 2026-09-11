import java.util.List;
import java.util.ArrayList;


public class AlgoritmoTrintaAL {
    public static void main(String[] args){
        int fatorial = Integer.parseInt(IO.readln("Digite o numero a fatorar: \n"));
        int total = 0;

        if(fatorial > 1){
            List<Integer> numeros = new ArrayList<>();
            List<Integer> antecessores = new ArrayList<>();
            for(int i = 1; i < fatorial; i++){
                numeros.add(i);
            }
            for(int i = numeros.size() - 1; i > 1; i--){
                antecessores.add(i);
            }
            for(int antecessor : antecessores){
                total = total + antecessor;
                IO.println("O total: " + total + " Da entrada: " + fatorial + " multiplicado por: " + antecessor + "\n");
            }
        }else{
            IO.println("O valor do fatorial é igual a 1");
        }
        
        IO.println("O valor total fatorado: " + total);

    }
}

// calcular o fatorial, armazenar, exibir cada etapa e exibir o resultado final
// se o valor for maior que 1 usar o valor para buscar seus numeros inteiros antecessores
