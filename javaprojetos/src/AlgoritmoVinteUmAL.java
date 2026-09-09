import java.util.List;

public class AlgoritmoVinteUmAL {
    public static void main(String[] args){
        List<Integer> numeros = List.of(45, 67, 89, 34, 23, 56 , 78, 98,45, 34);
        double total = 0;

        for(int numero : numeros){
            total += numero;
        }
        IO.println("A media da lista de numeros é " + total/2);
    }
}


// para cada numero somar ao total 