public class AlgoritmoQuatroAL {
    public static void main(String[] args){
        int diaDaSemana = 3;
        String nomeDia;

        switch (diaDaSemana){
            case 1:
                nomeDia = "segunda feira";
                break;
            case 2:
                nomeDia = "terça-feira";
                break;
            case 3:
                nomeDia = "quarta-feira";
                break;
            default:
                nomeDia = "dia invalido";
        }
        IO.println(nomeDia);
    }

    //moderno

    public static void moderno(){
        int diaDaSemana = 3;

        switch (diaDaSemana){
            case 1 -> IO.println("segunda-feira");
            case 2 -> IO.println("terça-feira");
            case 3 -> IO.println("quarta-feira");
            default -> IO.println("dia invalido");
        }
    }
}