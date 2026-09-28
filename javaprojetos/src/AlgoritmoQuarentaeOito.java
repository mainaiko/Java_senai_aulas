public class AlgoritmoQuarentaeOito {
    // considere a matriz quadrada
    /*
    20,50,80
    45,60,90
    5,67,89
    */

    // faça um algortmo que mostre apenas os valores da diagonal principal

    public void main(){
        int[][] matriz = {
            {20,50,80},
            {45,60,90},
            {5,67,89},
        };

        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz.length; j++){
                if(matriz[i] == matriz[j]){
                    IO.println(matriz[i][j]);
                }
            }
        }
    }
}
