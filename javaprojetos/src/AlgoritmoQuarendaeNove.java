import java.util.ArrayList;
import java.util.List;

public class AlgoritmoQuarendaeNove {
    // crie um algoritmo que pergunte?
    // qual laboratiorio adicionar
    // leia o laboratorio do usuario (ex: f03, f05)
    // crie um loop
    // adicione a lista
    // saia

    // mostre no final a qantidade de laboratorios adicionados
    // mostre todos os laboratorios

    public void main(){

        List<String> laboratorios = new ArrayList<>();

        do{
            IO.println("Qual laboratorio deseja adicionar?");
            IO.println("F03, F05, F06");
            String resposta = IO.readln();

            laboratorios.add(resposta);

            IO.println("Deseja adicionar mais um laboratorio?");
            IO.println("Digite 1 para sim 2 para nao");
            int respostaDois = Integer.parseInt(IO.readln());

            if(respostaDois == 1){
                IO.println("Qual laboratorio deseja adicionar?");
                IO.println("F03, F05, F06");
                String respostaTres = IO.readln();
                laboratorios.add(respostaTres);
            }else{
                for(String laboratorio:laboratorios){
                IO.println("Laboratorios adicionados: " + laboratorio);
                }
                IO.println("Numero de laboratorios adicionados: " + laboratorios.size());
                break;
            }
        }while(true);


    }
}
