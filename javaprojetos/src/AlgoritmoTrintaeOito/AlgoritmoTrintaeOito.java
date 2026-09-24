package AlgoritmoTrintaeOito;

import javax.swing.JOptionPane;

public class AlgoritmoTrintaeOito {
    public void main(){
        JOptionPane.showMessageDialog(null, "Agencia SenaiCar");

        Carro c = new Carro("PWP 2121", 220 , "hibrido flex", "azul", 4);

        JOptionPane.showMessageDialog(null, c.getPlaca());
        JOptionPane.showMessageDialog(null, c.getVelocidadeMax());
        JOptionPane.showMessageDialog(null, c.getTipoCombustivel());
    }
}