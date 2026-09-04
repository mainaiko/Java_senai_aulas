public class AlgoritmoNoveAL {
    public void main(String[] args){
        double numero1;
        double resultado;

        numero1 = Integer.parseInt(IO.readln("Digite um numero: "));

        resultado = numero1 / 3;

        IO.println("A terça parte do numero é = "+resultado);
    }
}
