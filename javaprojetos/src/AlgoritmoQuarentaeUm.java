public class AlgoritmoQuarentaeUm{
    public void main(){
        int[][] m = {{21,25}, {45,78}};
        int soma = 0;

        for(int i=0; i<m.length;i++){
            for(int j=0; j<m[j].length; j++){
                soma += m[i][j];
            }
        }
        IO.println(soma);
    }
}
