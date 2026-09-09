import java.util.List;

public class AlgoritmoVinteAL {
    public static void main(String[] args){
        List<String> cupons = List.of("PROMO10", "DESCONTO20TAO", "OHHHHMYGOOOO");

        // porque os ":" separado o print
        cupons.forEach(IO::println);
    }
}
