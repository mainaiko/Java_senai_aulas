public class AlgoritmoSeteAL {

    public void main(String[] args){
        double numero1;
        double numero2;
        double resultado;

        numero1 = Integer.parseInt(IO.readln("Digite o primeiro numero: "));
        numero2 = Integer.parseInt(IO.readln("Digite o segundo numero: "));

        resultado = numero1 + numero2;

        IO.println("A soma dos numeros é = "+resultado);
    }
    
}
