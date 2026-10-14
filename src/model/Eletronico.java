package model;

public class Eletronico {
    private String cor;
    private String marca;
    private double armazenamento;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(double armazenamento) {
        this.armazenamento = armazenamento;
    }

    public Eletronico(String cor, String marca, double armazenamento) {
        this.cor = cor;
        this.marca = marca;
        this.armazenamento = armazenamento;
    }
}
