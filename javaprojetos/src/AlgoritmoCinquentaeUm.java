public class AlgoritmoCinquentaeUm {
    public void main() {
        double resultado = 0; // 1. Declarada fora do try

        try {
            int numUm = Integer.parseInt(IO.readln("digite o primeiro numero: "));
            int numDois = Integer.parseInt(IO.readln("digite o segundo numero: "));

            
            resultado = numUm / numDois;

        } catch (NumberFormatException e) {
            IO.println("Erro: Entrada inválida. Digite apenas números inteiros.");
        } catch (ArithmeticException e) {
            IO.println("Erro: Não é possível dividir por zero.");
        } finally {
            IO.println("Resultado: " + resultado);
        }
    }
}