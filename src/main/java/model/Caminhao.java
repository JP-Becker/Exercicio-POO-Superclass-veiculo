
package model;

import javax.swing.JOptionPane;

public class Caminhao extends Veiculo {
    private int toneladas;
    private int alturaMax;
    private int comprimento;
    
    public Caminhao () {
        this(0, 0, 0);
    }
    
    public Caminhao (int toneladas, int alturaMax, int comprimento) {
        this.toneladas = toneladas;
        this.alturaMax = alturaMax;
        this.comprimento = comprimento;
    }
    
    // **Métodos Getters**

    public int getToneladas() {
        return toneladas;
    }

    public int getAlturaMax() {
        return alturaMax;
    }

    public int getComprimento() {
        return comprimento;
    }

    // **Métodos Setters**

    public void setToneladas(int toneladas) {
        this.toneladas = toneladas;
    }
    public void setToneladas(String toneladas) {
        this.toneladas = Integer.parseInt(toneladas);
    }
    
    public void setAlturaMax(int alturaMax) {
        this.alturaMax = alturaMax;
    }
    public void setAlturaMax(String alturaMax) {
        this.alturaMax = Integer.parseInt(alturaMax);
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }
    public void setComprimento(String comprimento) {
        this.comprimento = Integer.parseInt(comprimento);
    }
    
    public void leitura() {
        super.leitura();
        setToneladas(JOptionPane.showInputDialog("digite as toneladas"));
        setAlturaMax(JOptionPane.showInputDialog("digite a altura"));
        setComprimento(JOptionPane.showInputDialog("digite o comprimento"));
    }
    
    public void imprimir() {
       super.imprimir();
       JOptionPane.showMessageDialog(null,"toneladsa: " + getToneladas() + "\nAltura: " + getAlturaMax() + "\nComprimento: " + getComprimento());	
    }
}
