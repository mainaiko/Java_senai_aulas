import java.util.ArrayList;
import java.util.List;

public class AlgoritmoVinteeNoveAL {
    
    public static void main(String[] args){

        List<Double> vetor = new ArrayList<>();

        int vendas_total = Integer.parseInt(IO.readln("Quantas vezes deseja adicionar vendas: "));

        double soma = 0;
        double media = 0;

        if(vendas_total != 0){
            for(int i = 0; i < vendas_total; i++){
                double valor = Double.parseDouble(IO.readln("entre com o valor: "));
                vetor.add(valor);
            }
        }

        for(int i = 0; i < vetor.size() ; i++){
            soma = vetor.get(i) + soma;
        }
        
        IO.println("A soma total dos valores: " + soma);
        media = soma / vetor.size();
        IO.println("A media aritmetica dos valores: " + media);
    }
}
// quantas vezes deseja adicionar vendas
// para o numero total de vendas reistrar x vezes na lista vetor