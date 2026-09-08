public class AlgoritmoTrezeAL {

    public static void main(String[] args) {

        double numero1 = Double.parseDouble(IO.readln("Digite um numero: "));
        double numero2 = Double.parseDouble(IO.readln("Digite outro numero: "));

        if (numero1 > numero2) {
            IO.println("O numero " + numero1 + " é maior que o numero " + numero2);
        } else if (numero1 < numero2) {
            IO.println("O numero " + numero2 + " é maior que o numero " + numero1);
        } else {
            IO.println("Os numeros são iguais!");
        }
    }
}
