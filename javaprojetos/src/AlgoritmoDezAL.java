public class AlgoritmoDezAL {

    public void main(String[] args){
        double numero1;
        double numero2;
        double resultado;
        double resultado2;

        numero1 = Integer.parseInt(IO.readln("Digite o primeiro numero: "));
        numero2 = Integer.parseInt(IO.readln("Digite o segundo numero: "));

        resultado = numero1 + numero2;
        resultado2 = resultado / 2;

        IO.println("A media aritmetica é = "+resultado2);
    }
    
}
