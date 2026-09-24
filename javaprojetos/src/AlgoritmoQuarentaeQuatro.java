public class AlgoritmoQuarentaeQuatro {

    public void main(){
        // matriz unidimensional 1d
        // matriz bidimensinal 2d
        // matriz tridimensional 3d
        // tensores (N dimensoes - Redes neurais)

        double[][] notas = {{100,80,40,30},
                            {20,40,50,60},
                            {67,45,82,20},
                            {99,100,56,96},
                        };
        for(int i=0;i<notas.length;i++){
            for(int j=0;j<notas[i].length;j++){
                IO.println(notas[i][j]);
            }
        }
    }
}
