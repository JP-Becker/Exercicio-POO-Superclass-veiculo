package model;

import javax.swing.JOptionPane;


public class Veiculo {
    private int peso;
    private int velocMax;
    private float preco;
    
    public Veiculo () {
        this(0, 0, 0);
    }
    
    public Veiculo (int peso, int velocMax, float preco) {
        this.peso = peso;
        this.velocMax = velocMax;
        this.preco = preco;
    }
    
        // **Métodos Getters**

    public int getPeso() {
      return peso;
    }

    public int getVelocMax() {
      return velocMax;
    }

    public float getPreco() {
      return preco;
    }

    // **Métodos Setters**

    public void setPeso(int peso) {
      this.peso = peso;
    }
    
    public void setPeso(String peso) {
      this.peso = Integer.parseInt(peso);
    }

    public void setVelocMax(int velocMax) {
      this.velocMax = velocMax;
    }
    
    public void setVelocMax(String velocMax) {
      this.velocMax = Integer.parseInt(velocMax);
    }

    public void setPreco(float preco) {
      this.preco = preco;
    }
    
    public void setPreco(String preco) {
      this.preco = Float.parseFloat(preco);
    }
    
    public void leitura() {
       setPeso(JOptionPane.showInputDialog("digite o peso"));
       setVelocMax(JOptionPane.showInputDialog("digite a velocidade maxima"));
       setPreco(JOptionPane.showInputDialog("digite o preço"));
    }
    
    public void imprimir() {		
        JOptionPane.showMessageDialog(null,"Peso: " + getPeso() + "\nVelocidade maxima: " + getVelocMax() + 
     "\nPreço: " + getPreco());	
    }	
}
