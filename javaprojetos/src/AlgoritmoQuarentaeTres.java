public class AlgoritmoQuarentaeTres {

    public void main(){
        double[] notas = {100,70,80,50,40};
        int soma = 0;
        for(int i=0;i<notas.length;i++){
            soma += notas[i];
        }
        IO.println(soma);
    }
    
}
