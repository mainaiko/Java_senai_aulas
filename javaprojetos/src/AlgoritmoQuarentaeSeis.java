import java.util.ArrayList;
import java.util.List;

public class AlgoritmoQuarentaeSeis {
    // List () - 100,200,100
    // Dictionary () 100 -> maria, 200 -> natalia, 100 -> ele
    // Pesquisa
    /*
    4 interfaces 
    4 classes
    das collections
    */
    public void main(){
        // <> = generics -> posso criar uma lista de qualquer coisa inclusive objetos
        List<String> frutas = new ArrayList<>();
        frutas.add("Melancia");
        frutas.add("Goiaba");
        frutas.add("Amora");
        frutas.add("Mamão");

        //IO.println("Primeira fruta "+frutas.get(1));
        frutas.set(1, "Uva");
        for(String fruta:frutas){
            IO.println(fruta);
        }


    }
}
