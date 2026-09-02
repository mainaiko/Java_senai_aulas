void main(){
    String msg = IO.readln("Qual a mensagem a repetir?");
    int total = Integer.parseInt(IO.readln("Quantas vezes"));
    
    int contador = 1;
    while (contador <= total){
        IO.println(contador + "." + msg);
        contador++;
    }
}