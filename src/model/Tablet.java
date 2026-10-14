package model;

public class Tablet {
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

    public Tablet(String cor, String marca, double armazenamento) {
        this.setCor(cor);
        this.setMarca(marca);
        this.setArmazenamento(armazenamento);
    }
}
