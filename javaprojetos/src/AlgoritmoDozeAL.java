public class AlgoritmoDozeAL {

    public static void main(String[] args) {

        double numero1 = Double.parseDouble(IO.readln("Digite um numero: "));

        if (numero1 % 2 == 0) {
            IO.println("O numero " + numero1 + " é par!");
        } else {
            IO.println("O numero " + numero1 + " é impar!");
        }
    }

}