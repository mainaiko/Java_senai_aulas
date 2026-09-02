void main(){
    double preco = Double.parseDouble(IO.readln("Preço (R$)"));
    double pago = Double.parseDouble(IO.readln("Valor pago (R$)"));

    double troco = pago - preco;

    IO.println("Troco a devolver R$" + troco);
}