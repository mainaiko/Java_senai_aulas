public class AlgoritmoCincoAL {

    public void main(String[] args){
        double teste1 = Integer.parseInt(IO.readln("digite um numero: "));

        double antecessor = teste1 - 1;
        double sucessor = teste1 + 1;

        IO.println("O numero digitado " + teste1+" tem como antecessor: "+antecessor+" e como sucessor:"+sucessor);
    }
}
