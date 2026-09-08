public class AlgoritmoQuatorzeAL {

    public static void main(String[] args) {

        int opcao = Integer.parseInt(IO.readln("Digite uma opcao: "));

        switch (opcao) {
            case 1 -> IO.println("jogo iniciado");
            case 2 -> IO.println("suas vidas estão acabando");
            case 3 -> IO.println("Game Over!");
            default -> IO.println("Numero invalido");
        }
    }
}