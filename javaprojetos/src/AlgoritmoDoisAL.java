public class AlgoritmoDoisAL {
    void main(){
        IO.println("Quantos algoritmos voce ja venceu");
        String resposta = IO.readln("digite sua resposta: ");
        int total = Integer.parseInt(resposta);
        IO.println("So mais " + (360 - total) + "pela frente.");
    }
}
