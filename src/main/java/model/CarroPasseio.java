
package model;

import javax.swing.JOptionPane;

public class CarroPasseio extends Veiculo {
    private String cor;
    private String modelo;
    
    public CarroPasseio() {
        this("", "");
    }
    
    public CarroPasseio(String cor, String modelo) {
        this.cor = cor;
        this.modelo = modelo;
    }
    
     // **Métodos Getters**

    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }

    // **Métodos Setters**

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void leitura() {
        super.leitura();
        setCor(JOptionPane.showInputDialog("digite a cor"));
        setModelo(JOptionPane.showInputDialog("digite o modelo"));
    }
    
    public void imprimir() {
       super.imprimir();
       JOptionPane.showMessageDialog(null,"Cor: " + getCor() + "\nModelo: " + getModelo());	
    }
}
