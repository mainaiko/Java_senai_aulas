class AlgoritmoTrintaeTre{
    public void simbolo(){
        String simbolo = IO.readln("pise em qual simbolo -> sol lua estrela: ");

        String resultado = switch (simbolo){
            case "sol" ->   "o selo aquece sob os pes";
            case "lua" ->   "o selo esfria e brilha em prata";
            case "estrela" ->   "o selo ergue uma escada em luz";
            default -> "o selo permanece em silencio";
        };
        IO.println(resultado);
    }
}