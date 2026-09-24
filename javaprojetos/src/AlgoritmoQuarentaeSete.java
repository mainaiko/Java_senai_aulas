import java.util.ArrayList;
import java.util.List;

public class AlgoritmoQuarentaeSete {
    // faça um vetor que armazena 10 valores inteiros
    // imprima a media so valores

    public void main(){
        int numeroUsuario;
        double mediana;
        int totalNumeros = 0;
        List<Integer> numerosVetorUsuario = new ArrayList<>();

        for(int i = 1; i<=10;i++){
            numeroUsuario = Integer.parseInt(IO.readln("Digite 10 numeros inteiros "));
            numerosVetorUsuario.add(numeroUsuario);
        }
        for(int numero:numerosVetorUsuario){
            totalNumeros += numero;
        }

        mediana = totalNumeros / 10;

        IO.println(numerosVetorUsuario);
        IO.println("A mediana é " + mediana);
    }
}
