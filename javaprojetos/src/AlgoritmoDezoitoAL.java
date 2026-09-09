import java.util.ArrayList;
import java.util.List;

public class AlgoritmoDezoitoAL {
    public static void main(String[] args){

        // novo array de lista
        List<Integer> numeros = new ArrayList<>(List.of());

        for(int i = 0; i<=200;i++){
            if(i%2 == 0){
                numeros.add(i);
            }
        }

        IO.println(numeros);
    }
}